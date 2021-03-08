package com.rexyn.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;


/**
 * @author sheldon
 * 描述：
 * @date 2021/1/22 10:34
 */
public class Test3 {
    private static final Logger logger = LoggerFactory.getLogger("Test");

    /**
     * 输入流：将外界信息输入到系统
     * 输出流：将系统信息输出到外界
     *
     * @param args 参数
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src" + File.separator + "test.text");
            byte[] b = new byte[1024];
            logger.info("开始读取文件");
            int len = 1;
            while ((len = fis.read(b)) != -1) {
                String str = new String(b, "UTF-8");
                logger.info(str);
            }
            logger.info("文件读取完毕！");
        } catch (Exception e) {
            logger.info("文件读取异常");
            e.printStackTrace();
        } finally {
            assert fis != null;
            fis.close();
        }

    }
}
