package kzhou.datda.structure.huoffuman;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HuffmanEncoder {
    private PriorityQueue queue;       //辅助建立霍夫曼树的优先级队列
    private HuffmanTree tree;         //霍夫曼树
    private String [] message;            //以数组的形式存储消息文本
    private Map keyMap;                            //存储字符以及词频的对应关系
    private Map codeSet;                     //存储字符以及代码的对应关系

    public HuffmanEncoder(){
        queue = new PriorityQueue();
        keyMap = new HashMap<String,Integer>();
    }

    //获取指定字符串的霍夫曼编码
    public String encode(String msg){
        resolveMassage(msg);
        buildCodeSet();
        String code = "";
        for(int i=0;i<message.length;i++){//将消息文本的逐个字符翻译成霍夫曼编码
            code =code+codeSet.get(message[i]);
        }
        return code;
    }

    //将一段字符串消息解析成单个字符与该字符词频的对应关系，存入Map
    private void resolveMassage(String msg){

        char [] chars =msg.toCharArray();  //将消息转换成字符数组
        message = new String[chars.length];
        for(int i =0;i<chars.length;i++){
            String key = "";
            key =chars[i]+"";  //将当前字符转换成字符串

            message [i] =  key;
            if(keyMap.containsKey(key)){//如果Map中已存在该字符，则词频加一
                keyMap.put(key,(Integer)keyMap.get(key)+1);
            }else{//如果Map中没有该字符，加入Map
                keyMap.put(key,1);
            }
        }
    }

    //建立对应某段消息的代码集
    private void buildCodeSet(){
        Iterator it =keyMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry =(Map.Entry)it.next();
            //用该字符和该字符的词频为参数，建立一个新的节点，插入优先级队列
            queue.insert(new Node((Integer)entry.getValue(),(String)entry.getKey()));
        }
        queue.display();
        tree =queue.buildHuffmanTree();  //利用优先级队列生成霍夫曼树
        codeSet = tree.getCodeSet();   //获取霍夫曼树对应的代码集
    }

    //打印该段消息的代码集
    public void printCodeSet(){
        Iterator it =codeSet.entrySet().iterator();
        System.out.println("代码集：");
        while(it.hasNext()){
            Map.Entry entry =(Map.Entry)it.next();
            System.out.println(entry.getKey()+"——>"+entry.getValue());
        }
        System.out.println();
    }

    //获取该段消息的代码集
    public Map getCodeSet(){
        return codeSet;
    }
}