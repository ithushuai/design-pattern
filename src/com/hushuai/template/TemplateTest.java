package com.hushuai.template;

/**
 * created by it_hushuai
 * 2020/12/24 22:54
 */
public class TemplateTest {
    public static void main(String[] args) {
        SqlTemplate sqlOperate = new MysqlOperateImpl();
        sqlOperate.operateSql();
    }
}
