package cn.commond.commondobject;

import cn.commond.performer.Ligth;

public class OffLight implements CommondObject {
    private Ligth ligth;
    public OffLight( Ligth ligth){
        this.ligth = ligth;
    }
    @Override
    public void execute() {
        ligth.off();
    }

    @Override
    public void undo() {
        ligth.on();
    }
}
