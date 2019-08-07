package cn.decoration;

/**
 * 装饰者模式：动态的将职责附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案-组合/委托
 * OO思想：类对扩展开发，对修改关闭
 */
public abstract class Beverage {
    public String descripe = "Unknown Beverage";
    public final static String TALL = "tall";
    public final static String GRANDE = "graned";
    public final static String VENTI = "venti";
    public String size ;
    public String getDescripe(){
        return descripe;
    };
    public  void setSize(String size){
        this.size = size;
    };
    public abstract String getSize();
    public abstract  double cast();
}
