package edu.csuft.rt.spider;

//����һ�����Խ����߳�ִ�� ������
public class Task implements Runnable {
	
	//���
	int n;
	
	
	public Task(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +"��ʼ��"+n);
		//��ʱ
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "������"+n);
	}
	
	
	}
	
	
	
	


