import java.util.*;
class RandomNextBytesTestCase
{
public static void main(String gg[])
{
Random random=new Random();
byte [] array=new byte[10];
random.nextBytes(array);
System.out.println(new String(array));
}
}