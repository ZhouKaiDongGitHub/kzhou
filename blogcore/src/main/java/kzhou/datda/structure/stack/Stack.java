package kzhou.datda.structure.stack;

/**
 * 数据结构之栈  顺序存储-利用数组
 */
public class Stack {
    int size;//栈的大小
    int top;//栈顶指针
    Object[] stackArray;//数组是泛型不变的，不能创建泛型数组

    //构造函数
    public Stack(int size){
        stackArray = new Object[size];
        top = -1;
        this.size = size;
    }
    //进栈
    public void push(Object o){
        stackArray[++top] = o;
    }
    //出栈
    public Object pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }else
            return null;
    }
    //判空
    public Boolean isEmpty(){
        return (top == -1);
    }
    //取顶层元素
    public Object peek(){
        if(top > -1){
            return stackArray[top];
        }else {
            return null;
        }
    }
    //判满
    public Boolean isFull(){
        return (top ==size-1);
    }
}
