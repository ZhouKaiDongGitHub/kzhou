package cn.compaind.duck.step1;

import cn.design.Duck;

/**
 * 鸭子模拟器
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.simulate();
    }
    public void simulate(){
        MallardDuck m = new MallardDuck();
        RedHeadDuck r = new RedHeadDuck();
        DuckCall d = new DuckCall();
        RubberDuck ru = new RubberDuck();
        System.out.println("Duck Simulator:");
        simulate(m);
        simulate(r);
        simulate(d);
        simulate(ru);
    }
    public void simulate(Quickable quickable){
        quickable.quick();
    }

}
