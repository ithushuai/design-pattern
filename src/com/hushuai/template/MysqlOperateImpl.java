package com.hushuai.template;

/**
 * Mysql查询数据，且不使用预编译
 * created by it_hushuai
 * 2020/12/24 22:55
 */
public class MysqlOperateImpl extends SqlTemplate {
    @Override
    void loadDriver() {
        System.out.println("加载mysql驱动");
    }

    @Override
    void getConnection() {
        System.out.println("获取mysql连接");
    }

    @Override
    void executeSql() {
        System.out.println("执行sql");
    }

    @Override
    void executePreparedSql() {
        System.out.println("执行预编译sql");
    }

    @Override
    void getResult() {
        System.out.println("获得从mysql中查出的数据");
    }

    @Override
    public boolean isPrepared() {
        return false;
    }
}
