package edu.csuft.rt.spider;

//定义一个可以交给线程执行 的任务
public class Task implements Runnable {
	
	//编号
	int n;
	
	
	public Task(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +"开始："+n);
		//延时
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "结束："+n);
	}
	
	
	}
	
	
	
	


