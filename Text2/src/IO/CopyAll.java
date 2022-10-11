package IO;

import java.awt.dnd.InvalidDnDOperationException;
import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcCopy=new File("源文件路径");
        //拷贝目标
        File disCopy=new File("复制到的路径");
        //拷贝方法
        copyDir(srcCopy,disCopy);
    }
/*
拷贝目录

 */
    private static void copyDir(File srcCopy, File disCopy) {
        if (srcCopy.isFile()){      //如果是一个文件，return

            FileInputStream fis=null;
            FileOutputStream fos=null;

            try {
                //读文件
                fis=new FileInputStream(srcCopy);
                String path=(disCopy.getAbsolutePath().endsWith("\\")?disCopy.getAbsolutePath():disCopy.getAbsolutePath()+"\\")+srcCopy.getAbsolutePath().substring(3);
                //写文件
                fos=new FileOutputStream(path);
                //一边读一边写
                byte[] bytes=new byte[1024*1024];
                int readCount=0;
                while ((readCount= fis.read(bytes))!=-1){
                    fos.write(bytes,0,readCount);
                }



                fos.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
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
            return;
        }
        File[] files=srcCopy.listFiles();  //返回数组
        for (File file:files) {
            //获取绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){//如果是一个目录
                //源目录
                String srcYun=file.getAbsolutePath();
                //目标目录
                String disMu=(disCopy.getAbsolutePath().endsWith("\\")?disCopy.getAbsolutePath():disCopy.getAbsolutePath()+"\\")+srcYun.substring(3);//disCopy.getAbsolutePath(),获取目标目录路径，srcYun.substring截取
                File newFile=new File(disMu);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,disCopy);
        }
    }
}
