package com.sheldon.activiti;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 12:24
 */
public class FileUtils {
    /**
     * 将磁盘上的文件读取之后，存入到数据库中
     * @param args
     */
    public static void main(String[] args) throws Exception {


        // File file  = new File("G:\\idea操作手册.txt");
        File file  = new File("G:\\苏州房源展示需求分析.docx");
        String code = getCode("G:\\苏州房源展示需求分析.docx");
        System.out.println(code);
        InputStream is = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(is, "gb2312");
        // FileReader fr = new FileReader(file);
        //
        // String encoding = fr.getEncoding();
        // System.out.println(encoding);
         BufferedReader br = new BufferedReader(isr);
       while (true){
           String s = br.readLine();
           if(null == s){
               break;
           }
           System.out.println(s);
       }

        // FileInputStream fis = new FileInputStream(file);
        // BufferedInputStream bis = new BufferedInputStream(fis);
        // while (true){
        //     int line = bis.read();
        //     System.out.println(line);
        // }
        // int i = 0;
       //  byte[] data = new byte[1024];
       //  while ((i=fis.read(data))!= -1){
       //
       //  }

    }
    public static String getCode(String path) throws Exception{
        InputStream is= new FileInputStream(path);
        byte[] head = new byte[3];
        is.read(head);
        String code = "GBK";
        if(head[0]==-1 && head[1]==-2){
            code = "UTF-16";
        }else if(head[0] == -2 && head[1] == -1){
            code = "Unicode";
        }else if(head[0] == -17 && head[1] == -69 && head[2] == -61){
            code = "UTF-8";
        }else {
            System.out.println("没有确定出编码格式");
        }
        return code;
    }

}
