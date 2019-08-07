package cn.commond;

import cn.commond.commonder.SimpleRemoteControl;
import cn.commond.commondobject.*;
import cn.commond.performer.Ligth;
import cn.commond.performer.Sterem;
import cn.commond.performer.Television;
import org.junit.Test;

public class TestRemoteControl {

    @Test
    public void opneTelevison(){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Ligth ligth = new Ligth();
        Sterem sterem = new Sterem();
        Television television = new Television();

        CommondObject openLight = new OpenLight(ligth);
        CommondObject openTelevision = new OpenTelevision(television);
        CommondObject openSterem = new OpneSterem(sterem);
        CommondObject offLigth = new OffLight(ligth);
        CommondObject offTelevision = new OffTelevision(television);
        CommondObject offSterem = new OffSterem(sterem);

        simpleRemoteControl.setCommond(0,openLight,offLigth);
        simpleRemoteControl.setCommond(1,openTelevision,offTelevision);
        simpleRemoteControl.setCommond(2,openSterem,offSterem);

        simpleRemoteControl.buttonOnWasPressed(0);
        simpleRemoteControl.buttonOffWasPressed(0);
        simpleRemoteControl.buttonOnWasPressed(1);
        simpleRemoteControl.undoButtonWasPressed();
        simpleRemoteControl.buttonOffWasPressed(1);
        simpleRemoteControl.buttonOnWasPressed(2);
        simpleRemoteControl.buttonOffWasPressed(2);
        simpleRemoteControl.undoButtonWasPressed();
    }

    @Test
    public void macroCommond(){

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Ligth ligth = new Ligth();
        Sterem sterem = new Sterem();
        Television television = new Television();

        CommondObject openLight = new OpenLight(ligth);
        CommondObject openTelevision = new OpenTelevision(television);
        CommondObject openSterem = new OpneSterem(sterem);

        CommondObject[] commondObjecton = new CommondObject[]{openLight,openTelevision,openSterem};
        MacroCommondOn macroCommondOn = new MacroCommondOn(commondObjecton);

        CommondObject offLigth = new OffLight(ligth);
        CommondObject offTelevision = new OffTelevision(television);
        CommondObject offSterem = new OffSterem(sterem);

        CommondObject[] commondObjectoff = new CommondObject[]{offLigth,offTelevision,offSterem};
        MacroCommondOff macroCommondOff = new MacroCommondOff(commondObjectoff);
        simpleRemoteControl.setCommond(0,macroCommondOn,macroCommondOff);

        simpleRemoteControl.buttonOnWasPressed(0);
        simpleRemoteControl.buttonOffWasPressed(0);
    }
}
