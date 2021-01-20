package com.impetus.learning.FunctionalInterface;
public class Example2
{
interface Calculator
{
public int calculate(int a,int b);
}
interface GreetMessage
{
public String print(String message);
}
interface Operator
{
public int performOperation(int a,int b,Calculator c);
}
public static void main(String gg[])
{
Calculator addition=new Calculator(){
public int calculate(int a,int b)
{
return a+b;
}
};
Calculator substraction=new Calculator(){
public int calculate(int a,int b)
{
return a-b;
}
};
Calculator multiplication=new Calculator(){
public int calculate(int a,int b)
{
return a*b;
}
};
Calculator division=new Calculator(){
public int calculate(int a,int b)
{
return a/b;
}
};
Operator operator=new Operator(){
public int performOperation(int a,int b,Calculator calculator)
{
return calculator.calculate(a,b);
}
};
GreetMessage greetMessage=new GreetMessage(){
public String print(String message){
return message.toString();
}
};
System.out.println("Addition of 10 and 5 is : "+operator.performOperation(10,5,addition));
System.out.println("Substration of 10 and 5 is : "+operator.performOperation(10,5,substraction));
System.out.println("Multiplication of 10 and 5 is : "+operator.performOperation(10,5,multiplication));
System.out.println("Division of 10 and 5 is : "+operator.performOperation(10,5,division));
System.out.println("Hello ! "+greetMessage.print("Ramesh"));
System.out.println("Hello ! "+greetMessage.print("Suresh"));
}
}