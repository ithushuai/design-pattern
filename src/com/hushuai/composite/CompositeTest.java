package com.hushuai.composite;

/**
 * created by it_hushuai
 * 2020/12/19 17:11
 */
public class CompositeTest {
    public static void main(String[] args) {
        ChapterBranch root = new ChapterBranch("Java从入门到放弃");// 组合类的最高层级
        ChapterBranch chapter1 = new ChapterBranch("初识Java"); // 第一章
        ChapterBranch chapter2 = new ChapterBranch("Java基本语法"); // 第二章
        ArticleLeaf article1 = new ArticleLeaf("第一章第一篇", 1);
        ArticleLeaf article2 = new ArticleLeaf("第一章第二篇", 5);
        ArticleLeaf article3 = new ArticleLeaf("第一章第三篇", 10);
        ArticleLeaf article4 = new ArticleLeaf("第二章第一篇", 15);
        ArticleLeaf article5 = new ArticleLeaf("第二章第二篇", 20);

        chapter1.add(article1);
        chapter1.add(article2);
        chapter1.add(article3);

        chapter2.add(article4);
        chapter2.add(article5);

        root.add(chapter1);
        root.add(chapter2);
        root.description();
    }
}
