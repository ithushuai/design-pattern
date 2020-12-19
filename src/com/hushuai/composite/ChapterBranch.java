package com.hushuai.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝类，内部包含子分枝
 * created by it_hushuai
 * 2020/12/19 17:01
 */
public class ChapterBranch extends BookComposite {
    private String name;
    private List<BookComposite> nodes = new ArrayList<>(); // 树枝

    public ChapterBranch(String name) {
        this.name = name;
    }

    @Override
    protected void description() {
        System.out.println(name);
        for (BookComposite node : nodes) {
            node.description();
        }
    }

    public void add(BookComposite node) {
        this.nodes.add(node);
    }

    public void remove(BookComposite node) {
        this.nodes.remove(node);
    }
}
