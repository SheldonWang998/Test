package com.rexyn.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sheldon
 * 描述：
 * @date 2021/3/4 16:35
 */
public class Test {
    // public static void main(String s[]) {
    //     try {
    //         String url = "E:\\gsm\\";
    //         String FileName = "info.dat";
    //         File file = new File(url);
    //         file.mkdirs();
    //         //创建文件夹
    //         File fil = new File(url);
    //         fil.createNewFile();
    //
    //
    //         FileWriter fileWriter = new FileWriter(url + FileName);
    //         fileWriter.write("我的测试文件@|gsmc@|TEST");
    //         //写入文件
    //         fileWriter.close();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }
    // public static void main(String[] args) {
        // String path = "E:\\gsm\\info.dat";
        // try {
        //     String s = readFile(path);
        //     System.out.println(s);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    // }
    public void writeFile(String result) {
        try {
            String fileName = "E:/data/Data.dat";
            File file = new File(fileName);
            File fileParent = file.getParentFile();
            if (!fileParent.exists()) {
                fileParent.mkdirs();
            }
            file.createNewFile();
//               false:覆盖之前写的  如果是true则为追加
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8"));
            writer.write(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String temp = null;
        StringBuffer sb = new StringBuffer();
        temp = br.readLine();
        while (temp != null) {
            sb.append(temp + "@|");
            temp = br.readLine();
        }
        br.close();
        return sb.toString();
    }

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date time = calendar.getTime();
        String format = df.format(time);
        System.out.println(format);

    }
}
