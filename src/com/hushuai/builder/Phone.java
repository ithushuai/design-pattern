package com.hushuai.builder;

/**
 * created by it_hushuai
 * 2020/12/6 20:22
 */
public class Phone {
    String screen;
    String CPU;
    int memory;

    public Phone(String screen, String CPU, int memory) {
        this.screen = screen;
        this.CPU = CPU;
        this.memory = memory;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screen='" + screen + '\'' +
                ", CPU='" + CPU + '\'' +
                ", memory=" + memory +
                '}';
    }
}
