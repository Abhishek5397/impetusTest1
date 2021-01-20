import java.io.*;
import java.util.*;
import java.util.stream.*;
class ByteToStringConversion
{
public static void main(String gg[])
{
BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
String str;
int length;
byte [] bytes;
try
{
/*
str=bufferedReader.readLine();
length=str.length();
bytes=new byte[length];
*/
bytes=bufferedReader.readLine().getBytes();
String recoveredString=new String(bytes);
System.out.println("Recovered string : "+recoveredString);
System.out.println("*********************************");
str=new Random().ints(65,90).limit(7).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
System.out.println("New random string : "+str);
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
}
}