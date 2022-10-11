package IO;
//文件自己解输入流，万能 （硬盘--->内存）

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamText1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream =null;
        //创建对象
        try {
           fileInputStream = new FileInputStream("D:\\IDEA project\\Temp");
           /*while(true) {
               int readDta = fileInputStream.read();
               if(readDta==-1){
                   break;
               }
               System.out.println(readDta);
           }*/

           //改进
            int readData=0;
           while ((readData= fileInputStream.read())!=-1){
               System.out.println(readData);
           }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}