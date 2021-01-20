import java.util.*;
class OptionalTest
{
public static void main(String gg[])
{
String str=(String)Optional.ofNullable("str").get();
System.out.println(str);
}
}