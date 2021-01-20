class Resource
{
private int num;
private boolean b;
synchronized public void setNumber(int num)
{
if(this.b)
{
try
{
wait();
}catch(InterruptedException interruptedException)
{
System.out.println(interruptedException.getMessage());
}
}
this.num=num;
this.b=true;
notify();
System.out.println("Produced : "+this.num);
}
synchronized public int getNumber()
{
if(this.b==false)
{
try
{
wait();
}catch(InterruptedException interruptedException)
{
System.out.println(interruptedException.getMessage());
}
}
System.out.println("Consumed : "+this.num);
notify();
this.b=false;
return this.num;
}
}
class Producer extends Thread
{
private Resource resource;
public Producer(Resource resource)
{
this.resource=resource;
start();
}
public void run()
{
for(int i=201;i<=250;++i)this.resource.setNumber(i);
}
}
class Consumer extends Thread
{
private Resource resource;
public Consumer(Resource resource)
{
this.resource=resource;
start();
}
public void run()
{
for(int i=1;i<=50;++i)this.resource.getNumber();
}
}
class eg6
{
public static void main(String gg[])
{
Resource resource;
resource=new Resource();
new Producer(resource);
new Consumer(resource);
}
}