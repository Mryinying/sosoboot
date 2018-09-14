package com.it.scheduled;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;


/**
 * 没有任何任务相关的输出
 * 有部分任务相关的输出
 * 乱序的任务相关的输出
 * @Async所修饰的函数不要定义为static类型，这样异步调用不会生效
 * 异步回调
 * @author Mryinying
 *
 */
@Component
public class AsyncTasks {

	public static Random random = new Random();
	
	@Async  //将原来的同步函数变为异步函数
	public void doTaskOne() throws Exception {
		System.out.println("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
	}

	@Async
	public void doTaskTwo() throws Exception {
		System.out.println("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
	}
	
	@Async
	public void doTaskF() throws Exception {
		 ExecutorService executorService = Executors.newCachedThreadPool();
		 executorService.execute(new Thread());
	}

	@Async
	public void doTaskThree() throws Exception {
		System.out.println("开始做任务三");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
	}
	
//	那么我们如何判断上述三个异步调用是否已经执行完成呢？我们需要使用Future<T>来返回异步调用的结果
	
	@Async  //将原来的同步函数变为异步函数
	public Future<String> doTaskO() throws Exception {
		System.out.println("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务一完成");
	}

	@Async
	public Future<String> doTaskT() throws Exception {
		System.out.println("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务一完成");
	}

	@Async
	public Future<String> doTaskTh() throws Exception {
		System.out.println("开始做任务三");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务一完成");
	}

}