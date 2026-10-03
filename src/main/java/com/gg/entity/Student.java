package com.gg.entity;

/**
 * 学生实体
 */
public class Student {
    private String name;
    private String id;
    private String password;
    private String sex;
    private String clazz;//学生班级
    private String major;//所属专业
    //选课记录（语 数 英）

    public Student(){

    }
    public Student(String id,String name,String password,String sex,String clazz,String major){
        this.id=id;
        this.name=name;
        this.password=password;
        this.sex=sex;
        this.clazz=clazz;
        this.major=major;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getId() {
        return id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
