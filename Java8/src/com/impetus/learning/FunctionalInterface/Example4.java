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
public class Example4
{
interface Calculator
{
public int calculate(int a,int b);
}
interface GreetMessage
{
public String printMessage(String message);
}
private static int performOperation(int a,int b,Calculator calculator)
{
return calculator.calculate(a,b);
}
public static void main(String gg[])
{
int num1,num2;
BufferedReader bufferedReader;
bufferedReader=new BufferedReader(new InputStreamReader(System.in));
Cleaner cleaner=new Cleaner(bufferedReader);
try(cleaner)
{
System.out.print("Enter a number : ");
num1=Integer.parseInt(bufferedReader.readLine());
System.out.print("Enter another number : ");
num2=Integer.parseInt(bufferedReader.readLine());
}catch(NumberFormatException | IOException exception)
{
System.out.println("Exception caught : "+exception.getMessage());
return;
}
Calculator addition=(a,b) -> a+b;
Calculator substration= (a,b) -> a-b;
Calculator multiplication = (a,b) -> a*b;
Calculator division= (a,b) -> a/b;
GreetMessage greet=(message) -> message.toString();
System.out.println("Addition of "+num1+" and "+num2+" is : "+performOperation(num1,num2,addition));
System.out.println("Substraction of "+num1+" and "+num2+" is : "+performOperation(num1,num2,substration));
System.out.println("Multiplication of "+num1+" and "+num2+" is : "+performOperation(num1,num2,multiplication));
System.out.println("Division of "+num1+" and "+num2+" is : "+performOperation(num1,num2,division));
System.out.println("Hello, "+greet.printMessage("Abhishek !"));
System.out.println("Hello, "+greet.printMessage("Divyanshi !"));
}
}