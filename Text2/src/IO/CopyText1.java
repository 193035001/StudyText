package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件的拷贝
 */
public class CopyText1 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {   //创建对象
            fis=new FileInputStream("D:\\IDEA project\\Temp");
            fos=new FileOutputStream("D:\\Java\\project\\Temp");
            byte[] bytes=new byte[1024*1024];
            int readCount=0;
            while((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);

            }

            //刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            //分开处理异常
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
