package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamText {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //fos=new FileOutputStream("myFile");
            //追加方式,后面接布尔类型
            fos=new FileOutputStream("myFile",true);
            byte[] bytes={97,98,99,100,101,102,103};
            //谨慎使用会把源文件内容清空
            fos.write(bytes);
            String s="Hello,World!";
            byte[] by=s.getBytes();
            fos.write(by);
            //刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
