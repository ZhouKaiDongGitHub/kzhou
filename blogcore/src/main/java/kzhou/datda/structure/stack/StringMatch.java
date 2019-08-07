package kzhou.datda.structure.stack;

/**
 * 栈的应用：字符串匹配
 */
public class StringMatch {

    public void check(String s){
        String objectString = s;
        int strLength = s.length();
        Stack stack = new Stack(strLength);
        for (int i =0;i<strLength;i++){
            char ch = objectString.charAt(i);
            switch (ch){
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ']':
                case ')':
                case '}':
                    if(!stack.isEmpty()){
                        char chx = (char)stack.pop();
                        if((ch =='{'&& chx!='}')||(ch =='{'&& chx!='}')||(ch =='{'&& chx!='}')){
                            System.out.println("匹配出错！字符："+ch+"下标："+i);
                        }
                    }else {
                        System.out.println("匹配出错！字符："+ch+"下标："+i);
                    }
                    default:
                        break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("缺失右括号！");
        }else {
            System.out.println("匹配成功");
        }
    }
}
