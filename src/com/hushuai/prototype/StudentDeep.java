package com.hushuai.prototype;

import java.io.*;

/**
 * 深拷贝：利用Java对象流来实现对象的拷贝，对象的所有成员都会进行复制，包括引用类型的成员，它们不再指向同一个引用
 * 要求类必须实现Cloneable接口以及Serializable接口，引用类型的成员类也需要实现Serializable接口
 * created by it_hushuai
 * 2020/11/30 22:41
 */
public class StudentDeep implements Cloneable, Serializable {

    private int id;
    private String name;
    private Score score;

    public StudentDeep(int id, String name, Score score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public StudentDeep() {
    }

    @Override
    public String toString() {
        return "StudentDeep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        Object object = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            object = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        return super.clone();
        return object;
    }
}

/**
 * 学生课程类
 */
class Score implements Serializable{
    private String course;
    private int score;

    public Score(String course, int score) {
        this.course = course;
        this.score = score;
    }

    public Score() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "course='" + course + '\'' +
                ", score=" + score +
                '}';
    }
}

