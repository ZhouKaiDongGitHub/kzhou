package cn.compaind.duck.step5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 一群鸭子的集合
 */
public class Flock implements Quickable {
    public ArrayList duckList =  new ArrayList();

    public void add(Quickable quacker){
        duckList.add(quacker);
    }

    @Override
    public void quick() {
        Iterator iterator = duckList.iterator();
        while (iterator.hasNext()){
            Quickable quickable = (Quickable) iterator.next();
            quickable.quick();
        }
    }
}
