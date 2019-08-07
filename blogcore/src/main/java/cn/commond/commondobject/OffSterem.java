package cn.commond.commondobject;

import cn.commond.performer.Sterem;

public class OffSterem implements CommondObject {
    private Sterem sterem;
    public OffSterem(Sterem sterem){
        this.sterem = sterem;
    }
    @Override
    public void execute() {
        sterem.off();
    }

    @Override
    public void undo() {
        sterem.on();
    }
}
