package cn.kzhou.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxy {

    private User target;

    public UserProxy(User user){
        this.target = user;
    }

    public User getUserProxy() {

        User proxy = null;

        //指定负责加载的类加载器
        ClassLoader loader = target.getClass().getClassLoader();

        //加载要代理接口中的所有方法
        Class[] interfaces = new Class[]{User.class};

        InvocationHandler ih = new InvocationHandler() {

            /*
              proxy---代表了正在返回的代理对象
               method----代表正在执行的方法
              obj-----代表方法执行时传入的参数
             */
            public Object invoke(Object proxy, Method method, Object[] obj)
                    throws Throwable {

                System.out.println("-----------------------");
                System.out.println("验证用户是否有访问此资源的权限...");
                Object result = method.invoke(target, null);
                System.out.println("通知信息：该用户成功访问");
                /*
                 * method.invoke(obj,args)
                 *obj代表了被代理的类
                 *args代表了为代理类中的方法传入参数，我们这里的方法没有用到参数，所以传入null
                 * */
                return result;
            }
        };
        //Proxy 这是Java提供的代理类
        proxy = (User) Proxy.newProxyInstance(loader, interfaces, ih);
        return proxy;
    }

}
