package cn.commond.commondobject;

import cn.commond.performer.Ligth;

public class OpenLight implements CommondObject{

    private Ligth ligth;
    public OpenLight(Ligth ligth){
        this.ligth = ligth;
    }
    @Override
    public void execute() {
        ligth.on();
    }

    @Override
    public void undo() {
        ligth.off();
    }
}
