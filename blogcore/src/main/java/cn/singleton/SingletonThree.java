package cn.singleton;

/**
 * 单例模式下处理多线程方法2 急切实例化取代延迟实例化
 */
public class SingletonThree {

    private static SingletonThree singletonOne = new SingletonThree();
    private SingletonThree(){

    }
    public static SingletonThree getInstance(){
        return singletonOne;
    }
}
