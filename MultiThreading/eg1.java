class CommonResource
{
	private String str;
	synchronized public void setString(String str)
	{
		this.str=str;
		System.out.println(this.str);
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException interrupredException)
		{
			System.out.println(interrupredException.getMessage());
		}
		System.out.println(this.str);
	}
}
class Worker extends Thread
{
	private CommonResource resource;
	private String str;
	public Worker(CommonResource resource,String str)
	{
		this.resource=resource;
		this.str=str;
		start();
	}
	public void run()
	{
		this.resource.setString(this.str);
	}
}
class eg1{
	public static void main(String gg[])
	{
		CommonResource resource;
		resource=new CommonResource();
		new Worker(resource,"Hello");
		new Worker(resource,"Abhishek");
		new Worker(resource,"Kataria");
	}
}
