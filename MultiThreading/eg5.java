class mdm
{
private int num;
private boolean b=false;
synchronized public void setNumber(int n)
{
if(b==true)
{
try
{
wait();
}catch(InterruptedException ie)
{
}
}
num=n;
System.out.println("Produced : "+num);
b=true;
notify();
}
synchronized public int getNumber()
{ if(b==false)
{ try
{
wait();
}catch(InterruptedException ie)
{}}
System.out.println("Consumed : "+num);
b=false;
notify();
return num;
}} class Producer extends Thread
{
private mdm m;
Producer(mdm m)
{ this.m=m;
start();
}
public void run()
{
for(int x=201;x<=250;x++)
{
m.setNumber(x);
}}} class Consumer extends Thread
{
private mdm m;
Consumer(mdm m)
{ this.m=m;
start(); }
public void run()
{ int e,f;
for(e=1;e<=50;e++)
{
f=m.getNumber();
}
}
}
 class eg5
{
public static void main(String gg[])
{
mdm m=new mdm();
Producer p=new Producer(m);
Consumer c=new Consumer(m);
}}