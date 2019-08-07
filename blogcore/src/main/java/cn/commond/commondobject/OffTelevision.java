package cn.commond.commondobject;

import cn.commond.performer.Television;

public class OffTelevision implements CommondObject {
    private Television television;
    public OffTelevision(Television television){
        this.television = television;
    }
    @Override
    public void execute() {
        television.off();
    }

    @Override
    public void undo() {
        television.on();
    }
}
