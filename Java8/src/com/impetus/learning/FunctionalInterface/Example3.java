package com.impetus.learning.FunctionalInterface;
import java.io.*;
class Cleaner implements AutoCloseable
{
private BufferedReader bufferedReader;
public Cleaner(BufferedReader bufferedReader)
{
this.bufferedReader=bufferedReader;
}
public void close() throws IOException
{
this.bufferedReader.close();
}
}
public class Example3
{
interface Calculator
{
public int performOperation(int a,int b);
}
interface Operator
{
public int calculate(int a,int b,Calculator c);
}
interface GreetMessage
{
public String printMessage(String message);
}
public static void main(String gg[])
{
int a,b;
BufferedReader bufferedReader;
bufferedReader=new BufferedReader(new InputStreamReader(System.in));
try(Cleaner c=new Cleaner(bufferedReader))
{
System.out.print("Enter a number : ");
a=Integer.parseInt(bufferedReader.readLine());
System.out.print("Enter another number : ");
b=Integer.parseInt(bufferedReader.readLine());
}catch(NumberFormatException | IOException exception)
{
System.out.println("Exception caught : "+exception.getMessage());
return;
}
Operator operator=new Operator(){
public int calculate(int a,int b,Calculator calculator)
{
return calculator.performOperation(a,b);
}
};
System.out.println("Addition of "+a+" and "+b+" is : "+operator.calculate(a,b,new Calculator(){
public int performOperation(int a,int b){ return a+b; }
}));
System.out.println("Substraction of "+a+" and "+b+" is : "+operator.calculate(a,b,new Calculator(){
public int performOperation(int a,int b){ return a-b; }
}));
System.out.println("Multiplication of "+a+" and "+b+" is : "+operator.calculate(a,b,new Calculator(){
public int performOperation(int a,int b){ return a*b; }
}));
System.out.println("Division of "+a+" and "+b+" is : "+operator.calculate(a,b,new Calculator(){
public int performOperation(int a,int b){ return a/b; }
}));
GreetMessage greet=new GreetMessage(){
public String printMessage(String message)
{
return message.toString();
}
};
System.out.println("Hello, "+greet.printMessage("Divyanshi !"));
System.out.println("Hello, "+greet.printMessage("Abhishek !"));
}
}