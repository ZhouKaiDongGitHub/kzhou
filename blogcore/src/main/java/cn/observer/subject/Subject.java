package cn.observer.subject;

import cn.observer.obervers.Observer;

/**
 * 观察者设计模式：定义了对象之间的一对多依赖，这样一来，一个对象的状态改变，其他依赖着都会收到通知并自动更改状态。
 * OOS设计原则：高内聚，低耦合
 */
public interface Subject {

    void registerOberver(Observer ob);

    void removeOberver(Observer ob);

    void notifyOberver();
}
