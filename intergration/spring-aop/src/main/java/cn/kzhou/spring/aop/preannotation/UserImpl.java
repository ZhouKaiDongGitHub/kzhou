package cn.kzhou.spring.aop.preannotation;

public class UserImpl implements User {
    @Override
    public void normalUser() {
        System.out.println("普通用户资源访问");
    }

    @Override
    public void vip() {
        System.out.println("Vip用户资源访问");
    }

    @Override
    public void vvip() {
        System.out.println("VVip用户资源访问");
    }
}
