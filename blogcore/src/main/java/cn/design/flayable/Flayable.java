package cn.design.flayable;

/**
 * 变得部分，飞行能力，不限定鸭子
 *  策略模式：定义了算法族，分别封装起来，让他们之间可以相互替换。此模式让算法的变换独立于使用算法的客户。
 */
public interface Flayable {
    public void fly();
}
