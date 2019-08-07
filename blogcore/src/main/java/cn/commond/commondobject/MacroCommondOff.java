package cn.commond.commondobject;

public class MacroCommondOff implements CommondObject {

    private CommondObject[] commondObjects;

    public  MacroCommondOff(CommondObject[] commondObjects){
        this.commondObjects = commondObjects;
    }
    @Override
    public void execute() {
        for (int i=0;i<commondObjects.length;i++){
            commondObjects[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0;i<commondObjects.length;i++){
            commondObjects[i].undo();
        }
    }
}
