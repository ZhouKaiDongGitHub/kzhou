package kzhou.datda.structure.huoffuman;

import java.util.HashMap;
import java.util.Map;

public class HuffmanTree {
    private Node root;
    private Map codeSet = new HashMap();  //该霍夫曼树对应的字符编码集

    public HuffmanTree(Node root){
        this.root = root;
        buildCodeSet(root,"");  //初始化编码集
    }

    //生成编码集的私有方法，运用了迭代的思想
    //参数currentNode表示当前节点，参数currentCode代表当前节点对应的代码
    private void buildCodeSet(Node currentNode,String currentCode){
        if(currentNode.getKey() != null){
            //霍夫曼树中，如果当前节点包含关键字，则该节点肯定是叶子节点，将该关键字和代码放入代码集
            codeSet.put(currentNode.getKey(),currentCode);
        }else{//如果不是叶子节点，必定同时包含左右子节点，这种节点没有对应关键字
            //转向左子节点需要将当前代码追加0
            buildCodeSet(currentNode.getLeft(),currentCode+"0");
            //转向右子节点需要将当前代码追加1
            buildCodeSet(currentNode.getRight(),currentCode+"1");
        }
    }

    //获取编码集
    public Map getCodeSet(){
        return codeSet;
    }
}
