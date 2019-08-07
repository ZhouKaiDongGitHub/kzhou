package cn.kzhou.spring.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 定义StudentAddBean触发StudentAddEvent事件
 * 新建StudentAddBean类，实现接口 org.springframework.context.ApplicationContextAware中的setApplicationContext方法，
 * 在构造bean的时候注入Spring的上下文对象，以便通过Spring上下文对象的publishEvent方法来触发StudentAddEvent事件
 */
public class StudentAddBean implements ApplicationContextAware {

    /**
     * 定义Spring上下文对象
     */
    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 增加一个学生
     *
     * @param studentName
     */
    public void addStudent(String studentName) {
        // 1.构造一个增加学生的事件
        StudentAddEvent aStudentEvent = new StudentAddEvent(
                applicationContext, studentName);
        // 2.触发增加学生事件
        applicationContext.publishEvent(aStudentEvent);
    }
}
