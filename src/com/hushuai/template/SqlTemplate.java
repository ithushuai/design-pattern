package com.hushuai.template;

/**
 * created by it_hushuai
 * 2020/12/24 22:44
 */
public abstract class SqlTemplate {
    abstract void loadDriver();// 加载驱动

    abstract void getConnection();// 获取连接

    abstract void executeSql();// 执行sql

    abstract void executePreparedSql();// 执行预编译sql

    abstract void getResult();// 获取查询结果

    // 钩子方法
    // 子类可以重写，也可以不重写，钩子方法不影响模板主干运行，是一种供子类“可选、附加”的存在
    public boolean isPrepared() {
        return true;
    }

    /**
     * 定义操作sql查询的步骤，模板方法，定位为final，防止子类修改模板
     */
    public final void operateSql() {
        loadDriver();
        getConnection();
        if (isPrepared()) {
            executePreparedSql();
        } else {
            executeSql();
        }
        getResult();
    }
}
