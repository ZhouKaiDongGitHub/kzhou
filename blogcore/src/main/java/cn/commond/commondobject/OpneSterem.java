package cn.commond.commondobject;

import cn.commond.performer.Sterem;

public class OpneSterem implements CommondObject {
    private Sterem sterem;
    public OpneSterem(Sterem sterem){
        this.sterem = sterem;
    }
    @Override
    public void execute() {
        sterem.on();
        sterem.setChanal();
        sterem.setVolumn();
    }

    @Override
    public void undo() {
        sterem.off();
    }
}
