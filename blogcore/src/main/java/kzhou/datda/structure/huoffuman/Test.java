package kzhou.datda.structure.huoffuman;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Test {
    @org.junit.Test
    public  void test1(){
        PriorityQueue queue = new PriorityQueue();
        Node n1 = new Node(1,"if");
        Node n2 = new Node(1,"U");
        Node n3 = new Node(1,"T");
        Node n4 = new Node(2,"Y");
        Node n5 = new Node(2,"E");
        Node n6 = new Node(2,"A");
        Node n7 = new Node(3,"I");
        Node n8 = new Node(4,"sp");
        Node n9 = new Node(5,"S");
        queue.insert(n3);
        queue.insert(n2);
        queue.insert(n1);
        queue.insert(n6);
        queue.insert(n5);
        queue.insert(n4);
        queue.insert(n7);
        queue.insert(n8);
        queue.insert(n9);
        queue.display();

        HuffmanTree tree =queue.buildHuffmanTree();
        Map map = tree.getCodeSet();
        Iterator it =map.entrySet().iterator();
        System.out.println("霍夫曼编码结果：");
        while(it.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+"——>"+entry.getValue());
        }
    }

    @org.junit.Test
    public void test2(){
        String message = "chen long fei is hero !";
        HuffmanEncoder encoder = new HuffmanEncoder();
        String code =encoder.encode(message);

        encoder.printCodeSet();
        System.out.print("编码结果：");
        System.out.println(code);

        HuffmanDecoder decoder = new HuffmanDecoder(encoder.getCodeSet());
        String message2 =decoder.decode(code);
        System.out.print("解码结果：");
        System.out.println(message);
    }

    @org.junit.Test
    public void test3(){
        //Collection中是继承迭代器接口的
        List list = new LinkedList<String>();
        list.add("barry");
        list.add("stifee");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String str =(String)iterator.next();
            System.out.println(str);
        }

        //Map中是没有继承迭代器接口的
        Map map = new HashMap<Integer,String>();
        map.put(1,"barry");
        map.put(2,"stifee");
        map.put(3,"joy");
        map.put(4,"sim");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry entry = (Map.Entry)iterator1.next();
            System.out.println(entry.getKey() +""+ entry.getValue());
        }

    }

}
