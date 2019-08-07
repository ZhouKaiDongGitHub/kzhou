package cn.kzhou.spring.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 第二步 定义监听 实现接口org.springframework.context.ApplicationListener中的onApplicationEvent方法
 * 在该方法中只处理StudentAddEvent类型的ApplicationEvent事件
 */
public class StudentAddListener  implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        // 1.判断是否是增加学生对象的事件
        if (!(applicationEvent instanceof StudentAddEvent)) {
            return;
        }

        // 2.是增加学生事件的对象，进行逻辑处理，比如记日志、积分等
        StudentAddEvent studentAddEvent = (StudentAddEvent) applicationEvent;
        System.out.println("增加了学生:" + studentAddEvent.getName());
    }
}
