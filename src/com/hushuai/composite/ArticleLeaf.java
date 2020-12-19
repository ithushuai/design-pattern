package com.hushuai.composite;

/**
 * 树叶类，不能再分枝
 * created by it_hushuai
 * 2020/12/19 17:01
 */
public class ArticleLeaf extends BookComposite {
    private String name;
    private int page;

    public ArticleLeaf(String name, int page) {
        this.name = name;
        this.page = page;
    }

    @Override
    public void description() {
        System.out.println(this.name + "-" + this.page);
    }
}
