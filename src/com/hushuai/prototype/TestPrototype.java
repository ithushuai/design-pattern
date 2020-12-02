package com.hushuai.prototype;

/**
 * created by it_hushuai
 * 2020/11/30 22:24
 */
public class TestPrototype {

    public static void main(String[] args) {
        Student student = new Student(1, "张三");
        // 拷贝student对象
        Student clone = (Student) student.clone();
        System.out.println("原始对象：" + student);
        System.out.println("克隆对象：" + clone); // 1，张三
        System.out.println(clone == student); // false

        System.out.println("------test 深拷贝 --------");
        StudentDeep studentDeep = new StudentDeep(1, "张三", new Score("数学", 99));
        StudentDeep clone1 = null;
        try {
            clone1 = (StudentDeep)studentDeep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("原始对象：" + studentDeep);
        System.out.println("克隆对象：" + clone1);
        System.out.println(studentDeep == clone1);
    }
}
