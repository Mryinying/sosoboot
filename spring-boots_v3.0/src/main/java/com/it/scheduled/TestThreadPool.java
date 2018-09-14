package com.it.scheduled;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThreadPool {

	private final String TAG = this.getClass().getSimpleName();
	private static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2; // 核心线程数为 CPU 数＊2
	private static final int MAXIMUM_POOL_SIZE = 64; // 线程池最大线程数
	private static final int KEEP_ALIVE_TIME = 1; // 保持存活时间 1秒
	
	public static ExecutorService newFixedThreadPool(int nThreads) {
	    return new ThreadPoolExecutor(nThreads, nThreads,
	                                  0L, TimeUnit.MILLISECONDS,
	                                  new LinkedBlockingQueue<Runnable>());
	}

	// 如果是要求高吞吐量的，可以使用 SynchronousQueue 队列；如果对执行顺序有要求，可以使用
	// PriorityBlockingQueue；如果最大积攒的待做任务有上限，可以使用 LinkedBlockingQueue。
	private final BlockingQueue<Runnable> mWorkQueue = new LinkedBlockingQueue<>(128);

	private final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {
		private final AtomicInteger mCount = new AtomicInteger(1);

		public Thread newThread(Runnable r) {
			Thread thread = new Thread(r, TAG + " #" + mCount.getAndIncrement());
			thread.setPriority(Thread.NORM_PRIORITY);
			return thread;
		}
	};

	private ThreadPoolExecutor mExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME,
			TimeUnit.SECONDS, mWorkQueue, DEFAULT_THREAD_FACTORY, new ThreadPoolExecutor.DiscardOldestPolicy());
	
	private static volatile TestThreadPool mInstance = new TestThreadPool();
	 
    public static TestThreadPool getInstance() {
        return mInstance;
    }
 
    public void addTask(Runnable runnable) {
        mExecutor.execute(runnable);
    }
 
    public void shutdownNow() {
        mExecutor.shutdownNow();
    }

}
