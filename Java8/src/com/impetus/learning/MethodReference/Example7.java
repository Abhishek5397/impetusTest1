package com.impetus.learning.MethodReference;
import java.util.function.*;
import java.util.*;
interface TandA<T>
{
public List<T> transformAndAdd(List<T> list, Function<T,T> fun);
}

class OpsUtil
{
public static int doHalf(int x){ return x/2; }
public static int doDouble(int x){ return x*2; }
public static int doSquare(int x){ return x*x; }
}
public class Example7
{
public static void main(String gg[])
{
List<Integer> list=new LinkedList<>();
for(int i=1;i<=10;++i)list.add(i);

/*
TandA<Integer> ptr=new TandA<>(){
public List<Integer> transformAndAdd(List<Integer> list,Function<Integer,Integer> fun)
{
List<Integer> newList=new LinkedList<>();
for(Integer i : list)newList.add(fun.apply(i));
return newList;
}
};
*/

TandA<Integer> ptr= (a,b) ->{
List<Integer> newList=new LinkedList<>();
for(Integer i: a)newList.add(b.apply(i));
return newList;
};

//Method 1

List<Integer> resultList=ptr.transformAndAdd(list,OpsUtil::doHalf);
for(Integer i: resultList)System.out.print(i.intValue()+" ");
System.out.println();

//Method 2

resultList=ptr.transformAndAdd(list,x -> OpsUtil.doSquare(x));
for(Integer i: resultList)System.out.print(i.intValue()+" ");
System.out.println();

//Method 3

resultList=ptr.transformAndAdd(list,new Function<>(){
public Integer apply(Integer i)
{
return OpsUtil.doDouble(i.intValue());
}
});
for(Integer i: resultList)System.out.print(i+" ");
System.out.println();
}
}