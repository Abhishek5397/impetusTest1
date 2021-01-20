package com.impetus.learning.OptionalAPI;
import java.util.*;
import java.util.stream.*;
public class Example2
{
public static void main(String gg[])
{
String [] words=new String[10];
List<Optional<String>> optionalWords=Arrays.asList(words).stream().map(x -> Optional.ofNullable(x)).collect(Collectors.toList());
optionalWords.forEach(k -> {
if(k.isPresent())System.out.println("Word is present");
else System.out.println("Word is absent");
});
}
}