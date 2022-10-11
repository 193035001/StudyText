package IO;

/*
自带缓冲，不需要定义数组
 */

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderText {
    public static void main(String[] args) {
        //FileReader 节点流
        //BufferedReader  包装流/处理流
        FileReader reader=null;
        BufferedReader br=null;
        try {
            reader=new FileReader("CopyText2");
            //抽象类不能实例化，新建一个FileReader对象，读取reader
            br=new BufferedReader(reader);
            //readLine（）读取一行数据，到最后一行的时候返回null
            String s=null;
            while ((s=br.readLine())!=null){
                System.out.println(s);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if (br != null) {
                try {
                    br.close();     //只需要关闭最外层的流
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
