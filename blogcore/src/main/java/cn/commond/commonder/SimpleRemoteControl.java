package cn.commond.commonder;

import cn.commond.commondobject.CommondObject;
import cn.commond.commondobject.NoCommondObject;

import java.util.Stack;
import java.util.TreeSet;

/**
 * 遥控器对象，相当于调用者，对象里面只有命名对象而没有执行者
 */
public class SimpleRemoteControl {
    private CommondObject[] commondObjectOn;
    private CommondObject[] commondObjectOff;
    private CommondObject commondObject;

    private Stack<CommondObject> commondObjectsStack;
    public SimpleRemoteControl(){
        commondObjectOn = new CommondObject[7];
        commondObjectOff = new CommondObject[7];
        CommondObject noCommondObject = new NoCommondObject();
        for (int i = 0;i<7;i++){
            commondObjectOn[i] = noCommondObject;
            commondObjectOff[i] = noCommondObject;
        }
        commondObject = noCommondObject;
    }
    public void setCommond( int index,CommondObject commondObjectOn,CommondObject commondObjectOff){
        this.commondObjectOn[index] = commondObjectOn;
        this.commondObjectOff[index] = commondObjectOff;
    }
    public void buttonOffWasPressed(int index){
        commondObjectOff[index].execute();
        commondObject = commondObjectOff[index];
        commondObjectsStack.push(commondObjectOff[index]);
    }
    public void buttonOnWasPressed(int index){
        commondObjectOn[index].execute();
        commondObject = commondObjectOn[index];
        commondObjectsStack.push(commondObjectOn[index]);
    }

    public void undoButtonWasPressed(){
        commondObject.undo();
        commondObjectsStack.pop();
    }
}
