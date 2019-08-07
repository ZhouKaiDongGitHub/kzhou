package cn.commond.commondobject;

import cn.commond.performer.Television;

public class OpenTelevision implements CommondObject {
    private Television television;
    public OpenTelevision(Television television){
        this.television = television;
    }
    @Override
    public void execute() {
        television.on();
    }

    @Override
    public void undo() {
        television.off();
    }
}
