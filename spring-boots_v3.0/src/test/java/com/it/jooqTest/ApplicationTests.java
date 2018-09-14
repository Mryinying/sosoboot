package com.it.jooqTest;

import java.util.concurrent.Future;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.jooq.generated.tables.pojos.StudentInfo;
import com.it.scheduled.AsyncTasks;
import com.it.service.StuService;
import com.it.utils.JSONUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests{

	@Autowired
	private AsyncTasks task;
	
	@Autowired
	private StuService stuServiceImpl;

	@Test
	public void test() throws Exception {
		long start = System.currentTimeMillis();

		Future<String> task1 = task.doTaskO();
		Future<String> task2 = task.doTaskT();
		Future<String> task3 = task.doTaskTh();

		while(true) {
			if(task1.isDone() && task2.isDone() && task3.isDone()) {
				// 三个任务都调用完成，退出循环等待
				break;
			}
			Thread.sleep(1000);
		}

		long end = System.currentTimeMillis();

		System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
	}
	
	@Test
	public void getHello() throws Exception {
		StudentInfo bean = JSONUtil.toBean("{\"id\":20180003,\"stuName\":\"仙洒\",\"stuSex\":1,\"stuMajor\":\"计算机\",\"stuNation\":\"汉\",\"stuPoliticsStatus\":\"团员\",\"password\":\"654321\"}",StudentInfo.class);
		Assert.assertEquals(stuServiceImpl.findById(20180003), bean);
	}

}
