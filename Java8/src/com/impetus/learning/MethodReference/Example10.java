package com.impetus.learning.MethodReference;
import java.io.*;
import java.util.*;
import java.util.stream.*;
class Person1
{
private Integer age;
private String name;
public Person1()
{
Random random=new Random();
byte [] array=new byte[7];
random.nextBytes(array);
this.name=random.ints(97,123).limit(7).collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append);
this.age=age;
}
public int getAge(){ return this.age; }
public String getName(){ return this.name; }
}
public class Example10
{

}