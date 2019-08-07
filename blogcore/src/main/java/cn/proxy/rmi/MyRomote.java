package cn.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 代理模式：远程代理模式和RMI(远程方法调用)息息相关，我们先看一下远程调用的五个步骤
 * 1.定义远程服务接口
 * 2.实现远程服务接口，里面是真正的实现方法
 * 3.利用rmi生成客户辅助类和服务辅助类（利用Socket和I/O）
 * 4.
 * 5.启动远程服务，实例化远程对象，并添加到注册表中
 */

/**
 * 第一步：定义远程服务接口
 * 1.实现Remote接口，这是一个标志
 * 2.定义一些客户需要调用的方法
 * 3.方法的返回值必须是原语或者是序列化了的类
 */
public interface MyRomote extends Remote {
    public String sayHello() throws RemoteException;
}
