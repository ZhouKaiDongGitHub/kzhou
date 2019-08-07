package cn.commond.commondobject;

/**
 * 命令模式：将请求封装成对象，以便使用不同的请求，队列或者日志参数化其他对象。命令模式也支持撤销操作。
 */
public interface CommondObject {
    void execute();
    void undo();
}
