package cn.design.quackable;

/**
 * 变得部分，叫的能力，不限定鸭子
 * 策略模式 OO原则：
 * 1.抽取变化和不变的部分，以便于变化部分的扩展，减少对不变部分的影响。
 * 2.面向接口编程，而不是面向实现编程
 * 3.多使用组合，少使用继承（多用有一个，少使用是一个）
 */
public interface Quackable {
    public void quack();
}
