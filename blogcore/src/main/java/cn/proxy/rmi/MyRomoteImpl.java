package cn.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 第二步： 实现远程服务接口，里面是真正的实现方法
 * 1.必须实现远程接口
 * 2.可以利用已有的超类UnicastRemoteObject来处理很多实现
 * 3.因为UnicastRemoteObject的构造器抛出异常，所以MyRomoteImpl构造器也需要抛出异常
 */
public class MyRomoteImpl extends UnicastRemoteObject implements MyRomote {
    @Override
    public String sayHello() throws RemoteException {
        return "Server say：Hello!";
    }

    public MyRomoteImpl() throws RemoteException{};
}
