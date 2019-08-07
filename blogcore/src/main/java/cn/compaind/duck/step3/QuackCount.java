package cn.compaind.duck.step3;

/**
 * 装饰器，在原有基础上装饰上计算叫的次数的行为
 */
public class QuackCount implements Quickable {
    public Quickable duck;
    public static int numberOfQuacks;


    public QuackCount( Quickable duck){
        this.duck = duck;
    }

    @Override
    public void quick() {
        duck.quick();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks(){
        return numberOfQuacks;
    }
}
