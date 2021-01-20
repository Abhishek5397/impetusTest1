class Resource
{
private String str;
public void setString(String str)
{
this.str=str;
System.out.println(this.str);
try
{
Thread.sleep(1000);
}catch(InterruptedException interruptedException)
{
System.out.println(interruptedException.getMessage());
}
System.out.println(this.str);
}
}
class Worker extends Thread
{
private Resource resource;
private String str;
public Worker(Resource resource, String str)
{
this.resource=resource;
this.str=str;
start();
}
public void run()
{
synchronized(this.resource)
{
this.resource.setString(this.str);
}
}
}
class eg2
{
public static void main(String gg[])
{
Resource resource;
resource=new Resource();
new Worker(resource,"Hello");
new Worker(resource,"Abhishek");
new Worker(resource,"Kataria");
}
}