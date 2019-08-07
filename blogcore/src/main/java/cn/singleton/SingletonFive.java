package cn.singleton;

/**
 *  单例模式下处理多线程方法3  双重检查加锁
 */
public class SingletonFive{
    private volatile static SingletonFive singletonOne;
    private SingletonFive(){

    }
    public  static SingletonFivegetInstance(){
        if(singletonOne ==null){
            synchronized (SingletonFive.class){
                if(singletonOne==null){
                    singletonOne = new SingletonFive();
                }
            }
        }
        return singletonOne;
    }
}
