package com.hushuai.command;

/**
 * created by it_hushuai
 * 2021/1/3 15:35
 */
public class CommandTest {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        RemoteController controller = new RemoteController(lightOnCommand);
        controller.onLightCommand(lightOnCommand);
        controller.unDoOnLightCommand(lightOnCommand);
    }
}
