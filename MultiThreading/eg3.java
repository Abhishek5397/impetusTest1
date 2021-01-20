class Resource1
{
	private int num;
	public void setNumber(int num)
	{
		this.num=num;
		System.out.println("Produced : "+this.num);
	}
	public void getNumber()
	{
		System.out.println("Consumed : "+this.num);
	}
}
class Producer1 extends Thread
{
	private Resource1 resource;
	public Producer1(Resource1 resource)
	{
		this.resource=resource;
		start();
	}
	public void run()
	{
		for(int i=201;i<=250;++i)
			this.resource.setNumber(i);
	}
}
class Consumer1 extends Thread
{
	private Resource1 resource;
	public Consumer1(Resource1 resource)
	{
		this.resource=resource;
		start();
	}
	public void run()
	{
		for(int i=1;i<=50;++i)
			this.resource.getNumber();
	}
}
class eg3{
	public static void main(String gg[])
	{
		Resource1 resource;
		resource=new Resource1();
		new Producer1(resource);
		new Consumer1(resource);
	}
}
