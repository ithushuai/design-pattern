package com.hushuai.command;

/**
 * created by it_hushuai
 * 2021/1/3 15:26
 */
public class LightOnCommand implements ICommand {
    private boolean isOn = false;

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
        System.out.println("灯开了");
    }

    // 打开灯
    @Override
    public void execute() {
        this.isOn = true;
    }

    // 撤销开灯
    @Override
    public void undo() {
        this.isOn = false;
        System.out.println("灯关了");
    }
}
