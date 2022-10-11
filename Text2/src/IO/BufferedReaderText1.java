package IO;

import java.io.*;

public class BufferedReaderText1 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            /*//套娃
            //字节流文件
            FileInputStream in = new FileInputStream("CopyText2");
            //转换流，将字节流转换成字符流
            InputStreamReader reader = new InputStreamReader(in);
            //只能读取字符流
             br = new BufferedReader(reader);*/

            br = new BufferedReader(new InputStreamReader(new FileInputStream("CopyText2")));
             String s=null;
             while ((s=br.readLine())!=null){
                 System.out.println(s);
             }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br!= null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}