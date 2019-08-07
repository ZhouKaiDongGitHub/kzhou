package cn.kzhou.spring.events;

import org.springframework.context.ApplicationEvent;

/**
 * 第一步 定义事件  实现抽象类org.springframework.context.ApplicationEvent
 */
public class StudentAddEvent extends ApplicationEvent {

    private String name;

    public StudentAddEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
