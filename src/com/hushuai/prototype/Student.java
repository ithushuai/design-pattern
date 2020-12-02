package com.hushuai.prototype;

/**
 * 浅拷贝，需要类实现Cloneable接口，然后重写Object的clone方法，clone内调用父类的clone方法即可。
 * 如果不实现Cloneable接口，则对象调用clone方法报错CloneNotSupportedException，如果不重写方法，则对象不能调用clone方法，因此Object的clone方法是proteced修饰的
 * ***当类的成员变量为基本数据类型或者字符串时，拷贝出来的成员变量值与原始对象成员完全一样；
 * ***当类的成员变量为引用类型时，拷贝出来成员变量与原始对象的成员指向同一个引用，并不会克隆引用类型的成员
 * 即使类只有没有引用类型成员，拷贝出来的对象跟原始对象也不是同一个对象
 * created by it_hushuai
 * 2020/11/30 22:19
 */
public class Student implements Cloneable{

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 克隆实例，使用Object默认方法，此为浅拷贝
     * @return
     */
    @Override
    protected Object clone() /*throws CloneNotSupportedException*/ {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
