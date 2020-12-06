package com.hushuai.builder;

/**
 * 构建者对象构建任何一个部件，都返回构建者对象本身，只有构建者对象调用build方法，才真正返回用户需要的对象
 * 这种模式很常见，在很多框架中我们需要得到某个复杂对象，我们甚至都不需要去查看源码就能通过对象的建造者来帮我们得到对象
 * 很多Builder已经帮使用者创建了符合条件的对象，只需要我们调用Builder的方法就能得到。
 * 对于建造者中各个部件构建的方法，有的需要使用者传入参数，对对象的部件进行自定义，有的可能不需要用户传入参数，内部就会对对象进行默认构造
 * created by it_hushuai
 * 2020/12/6 20:54
 */
public class BuilderTest {
    public static void main(String[] args) {
        BasicPhoneBuilder basicPhoneBuilder = new BasicPhoneBuilder();
        // 这种写法有没有很眼熟，链式编程
        Phone phone = basicPhoneBuilder.buildScreen("京东方").buildMemory(8).buildCPU("骁龙").build();
        Phone phone1 = new BasicPhoneBuilder().buildScreen("京东方").buildMemory(8).build();// 对象的部分部件不构建也不影响对象的创建

        System.out.println(phone);
        System.out.println(phone1);
    }
}
