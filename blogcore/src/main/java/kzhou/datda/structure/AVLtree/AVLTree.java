package kzhou.datda.structure.AVLtree;

import java.util.Map;

public class AVLTree {
    AVLTreeNode root;

    //插入操作的入口
    public void insert(int value){
        root = insert(root, value);
    }
    //插入的递归实现
    private AVLTreeNode insert(AVLTreeNode subTree, int insertValue) {
        if (subTree == null) {
            return new AVLTreeNode(insertValue, null, null);
        }
        if (insertValue < subTree.value) { // 插入左子树
            subTree.left = insert(subTree.left, insertValue);
            if (unbalanceTest(subTree)) { // 插入后造成失衡
                if (insertValue < subTree.left.value) { // LL型失衡
                    subTree = leftLeftRotation(subTree);
                } else { // LR型失衡
                    subTree = leftRightRotation(subTree);
                }
            }
        } else if (insertValue > subTree.value) { // 插入右子树
            subTree.right = insert(subTree.right, insertValue);
            if (unbalanceTest(subTree)) { // 插入后造成失衡
                if (insertValue < subTree.right.value) { // RL型失衡
                    subTree = rightLeftRotation(subTree);
                } else { // RR型失衡
                    subTree = rightRightRotation(subTree);
                }
            }
        } else {
            throw new RuntimeException("duplicate value: " + insertValue);
        }
        return subTree;
    }

    private AVLTreeNode leftLeftRotation(AVLTreeNode k2) {
        AVLTreeNode k1;
        k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }
    private AVLTreeNode leftRightRotation(AVLTreeNode k3) {
        k3.left = rightRightRotation(k3.left);
        return leftLeftRotation(k3);
    }
    private AVLTreeNode rightRightRotation(AVLTreeNode k1) {
        AVLTreeNode k2;
        k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
    private AVLTreeNode rightLeftRotation(AVLTreeNode k1) {
        k1.right = leftLeftRotation(k1.right);
        return rightRightRotation(k1);
    }
    //获取树的深度
    private static int getDepth(AVLTreeNode treeRoot, int initDeep) {
        if (treeRoot == null) {
            return initDeep;
        }
        int leftDeep = initDeep;
        int rightDeep = initDeep;
        if (treeRoot.left != null) {
            leftDeep = getDepth(treeRoot.left, initDeep++);
        }
        if (treeRoot.right != null) {
            rightDeep = getDepth(treeRoot.right, initDeep++);
        }

        return Math.max(leftDeep, rightDeep);
    }
    //判断是否失衡
    private boolean unbalanceTest(AVLTreeNode treeRoot) {
        int leftHeight = getDepth(treeRoot.left, 1);
        int righHeight = getDepth(treeRoot.right, 1);
        int diff = Math.abs(leftHeight - righHeight);
        return diff > 1;
    }
    //删除操作的入口
    public void remove(int value) {
        root = remove(root, value);
    }
    //删除操作的递归实现
    private AVLTreeNode remove(AVLTreeNode tree, int value) {
        if (tree == null) {
            return tree;
        }
        if (value < tree.value) { //要删除的节点在左子树
            tree.left = remove(tree.left, value);
        } else if (value > tree.value){  //要删除的节点在右子树
            tree.right = remove(tree.right, value);
        } else if (tree.value == value) {  //要删除的节点就是本身
            if (tree.left != null && tree.right != null) { // 左右子树都存在
                if (getDepth(tree.left, 1) > getDepth(tree.right, 1)) {
                    /**
                     * 如果tree的左子树比右子树高:
                     * 1. 找出tree的左子树中的最大节点
                     * 2. 将该最大节点的值赋值给tree。
                     * 3. 删除该最大节点。
                     * 这类似于用"tree的左子树中最大节点"做"tree"的替身
                     * 采用这种方式的好处是：删除"tree的左子树中最大节点"之后，AVL树仍然是平衡的
                     */
                    AVLTreeNode max = getMaxNode(tree.left);
                    tree.value = max.value;
                    tree.left = remove(tree.left, max.value);
                } else {
                    /**
                     * 如果tree的左子树不高于右子树:
                     * 1. 找出tree的右子树中的最小节点
                     * 2. 将该最小节点的值赋值给tree。
                     * 3. 删除该最小节点。
                     * 这类似于用"tree的右子树中最小节点"做"tree"的替身
                     * 采用这种方式的好处是：删除"tree的左子树中最大节点"之后，AVL树仍然是平衡的
                     */
                    AVLTreeNode min = getMinNode(tree.right);
                    tree.value = min.value;
                    tree.right = remove(tree.right, min.value);
                }
            } else {
                tree = tree.left == null ? tree.right : tree.left;
            }
        } else {
            System.out.println("no node matched value: " + value);
        }
        return tree;
    }

    //获取值最大的节点
    private AVLTreeNode getMaxNode(AVLTreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.right != null) {
            return getMaxNode(node.right);
        } else {
            return node;
        }
    }
    //获取值最小的节点
    private AVLTreeNode getMinNode(AVLTreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.left != null) {
            return getMinNode(node.left);
        } else {
            return node;
        }
    }
    //前序遍历
    public void preorder(AVLTreeNode currentRoot) {
        if (currentRoot != null) {
            System.out.print(currentRoot.value + "\t");
            preorder(currentRoot.left);
            preorder(currentRoot.right);
        }
    }
}
