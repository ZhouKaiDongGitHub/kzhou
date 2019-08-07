package cn.singleton;

/**
 *  单例模式下处理多线程方法3  双重检查加锁
 */
public class SingletonFour  {
    private volatile static SingletonFour singletonOne;
    private SingletonFour(){

    }
    public  static SingletonFour getInstance(){
        if(singletonOne ==null){
            synchronized (SingletonFour.class){
                if(singletonOne==null){
                    singletonOne = new SingletonFour();
                }
            }
        }
        return singletonOne;
    }
}
