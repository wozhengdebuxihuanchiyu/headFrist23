package com.yu.doings.command;

/**
 * @author yuchangying
 * @date 2022-06-17 16:40:26
 * 命令模式：
 * 1、command:命令接口
 * 2、concreteCommands:会实现各种类型的请求。 具体命令自身并不完成工作， 而是会将调用委派给一个业务逻辑对象。
 * 3、Invoke:负责对请求进行初始化， 其中必须包含一个成员变量来存储对于命令对象的引用。
 * 4、receiver:接收者,完成实际的工作
 * 5、client:客户端
 *
 * 此处为——客户端
 */
public class Client {

    public static void main(String[] args) {
        //电灯执行者
        LightReceiver lightReceiver = new LightReceiver();
        //电灯命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //遥控器初始化
        RemoteControllerInvoke remoteControllerInvoke = new RemoteControllerInvoke();
        remoteControllerInvoke.setCommands(0,lightOnCommand,lightOffCommand);

        //遥控器操作
        //开
        System.out.println("按下电灯的开按钮");
        remoteControllerInvoke.onButtonWasPushed(0);
        //关
        System.out.println("按下电灯的关按钮");
        remoteControllerInvoke.offButtonWasPushed(0);
        //撤销
        System.out.println("按下撤销按钮");
        remoteControllerInvoke.undoButtonWasPushed();

    }
}
