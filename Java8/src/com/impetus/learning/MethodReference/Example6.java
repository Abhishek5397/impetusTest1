package com.impetus.learning.MethodReference;
interface MessageInterface
{
public void print(String message);
}
class Message
{
public Message(String message)
{
System.out.println("Message : "+message);
}
}
public class Example6
{
public static void main(String gg[])
{
MessageInterface messageInterface=Message::new;
System.out.print("Message from message interface : ");
messageInterface.print("This is the message I wanna print");
}
}