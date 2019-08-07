package cn.commond.commondobject;

public class NoCommondObject implements CommondObject {
    @Override
    public void execute() {
        System.out.println("不执行任何命令！");
    }

    @Override
    public void undo() {
        System.out.println("不执行任何命令！");
    }
}
