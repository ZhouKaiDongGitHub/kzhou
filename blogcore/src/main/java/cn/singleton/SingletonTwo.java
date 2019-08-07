package cn.singleton;

/**
 * 我们默认每一个程序都是多线程的。单例模式下处理多线程方法1 getInstance变成同步方法
 */
public class SingletonTwo {

    private static SingletonTwo singletonOne;
    private SingletonTwo(){

    }
    public synchronized static SingletonTwo getInstance(){
        if(singletonOne ==null){
            singletonOne = new SingletonTwo();
        }
        return singletonOne;
    }
}
