package cn.singleton;

/**
 * 单例模式：定义了一个类创建唯一对象的方式，并提供一个全局访问点
 */
public class SingletonOne {

    private static SingletonOne singletonOne;
    private SingletonOne(){

    }
    public static SingletonOne getInstance(){
        if(singletonOne ==null){
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }
}
