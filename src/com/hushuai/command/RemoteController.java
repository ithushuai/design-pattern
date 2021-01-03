package com.hushuai.command;

/**
 * 家电遥控器
 * created by it_hushuai
 * 2021/1/3 15:32
 */
public class RemoteController {
    private ICommand command;

    public RemoteController(ICommand command) {
        this.command = command;
    }

    public void onLightCommand(ICommand command) {
        if (command instanceof LightOnCommand) {
            command.execute();
        } else {
            System.out.println("未集成该功能");
        }
    }

    public void unDoOnLightCommand(ICommand command) {
        if (command instanceof LightOnCommand) {
            command.undo();
        } else {
            System.out.println("未集成该功能");
        }
    }
}
