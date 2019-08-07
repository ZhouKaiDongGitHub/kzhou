package cn.kzhou.spring.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext在运行期会自动检测到所有实现了ApplicationListener的bean对象，并将其作为事件接收对象。
 * 当ApplicationContext的publishEvent方法被触发时，每个实现了ApplicationListener接口的bean都会收到ApplicationEvent对象，
 * 每个ApplicationListener可根据事件类型只接收处理自己感兴趣的事件，比如上面的StudentAddListener只接收StudentAddEvent事件。
 */
public class EventListenerTest {
    public static void main(String[] args) {
        String[] xmlConfig = new String[] { "spring/spring.xml" };
        // 使用ApplicationContext来初始化系统
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);
        StudentAddBean studentBean = (StudentAddBean) context.getBean("studentAddBean");
        studentBean.addStudent("张三");
        studentBean.addStudent("李四");
    }
}
