package com.gg;
/**
 * 文件数据存储
 * 每个账户单独一个txt,用来存储账号主的信息
 */

import java.io.File;

/**
 * 处理文件读写
 */
public class HandlerFile {
    //存储数据的位置
    static String Student_URL=".../data/students";
    static String Manager_URL=".../data/Managers";
    //用map键值对存储学生的账号和密码，（（账号，密码），（课程））

    public HandlerFile(){

     }

    /**
     * 数据写入
     */
    public String FileIn(){
        return null;
    }

    /**
     * 数据读出
     */
    public String FileOut(){
        return null;
    }
}
