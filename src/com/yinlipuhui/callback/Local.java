package com.yinlipuhui.callback;

public class Local implements CallBackDemo, Runnable {
	private Remote remote;
	private String message;

	public Local(Remote remote, String message) {
		super();
		this.remote = remote;
		this.message = message;
	}

	public void sendMessage() {
		/** 当前线程的名称 **/
		System.out.println(Thread.currentThread().getName());
		/** 创建一个新的线程发送消息 **/
		Thread thread = new Thread(this);
		thread.start();
		/** 当前线程继续执行 **/
		System.out.println("Message has been sent by Local~!");
	}

	@Override
	public void execute(Object... objects) {
		// TODO Auto-generated method stub
		/** 打印返回的消息 **/
		System.out.println(objects[0]);
		/** 打印发送消息的线程名称 **/
		System.out.println(Thread.currentThread().getName());
		/** 中断发送消息的线程 **/
		Thread.interrupted();
	}

	@Override
	public void run() {
		remote.executeMessage(message, this); // 这相当于给同学打电话，打完电话之后，这个线程就可以去做其他事情了，只不过等到你的同学打回电话给你的时候你要做出响应
	}
}
