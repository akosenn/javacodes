package com.yinlipuhui.callback;

public class Remote {
	/**
	 * 处理消息
	 */
	public void executeMessage(String msg, CallBackDemo cb) {
		/** 模拟远程类正在处理其他事情，可能需要花费许多时间 **/
		for (int i = 0; i < 1000000000; i++) {

		}
		/** 处理完其他事情，现在来处理消息 **/
		System.out.println(msg);
		System.out.println("I hava executed the message by Local");
		/** 执行回调 **/
		cb.execute(new String[] { "Nice to meet you~!" }); // 这相当于同学执行完之后打电话给你
	}
}
