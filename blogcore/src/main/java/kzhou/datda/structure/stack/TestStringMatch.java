package kzhou.datda.structure.stack;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStringMatch {

    @Test
    public void testStringMatch(){
        System.out.println("输入需要检测的字符串：");
        //String str = getString();
        StringMatch checker = new StringMatch();
        checker.check("a{b(c[d]e)f}}");
    }

    public static String getString(){
        String str = "";
        try{
            InputStreamReader reader =new InputStreamReader(System.in);
            BufferedReader bReader = new BufferedReader(reader);
            str = bReader.readLine();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
