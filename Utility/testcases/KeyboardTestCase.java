import com.impetus.common.util.*;
	class KeyboardTestCase {
	public static void main(String gg[])
	{
		try
		{
			Keyboard keyboard=new Keyboard();
			System.out.println("String input : "+keyboard.getString("Enter string : "));
			System.out.println("Long input : "+keyboard.getLong("Enter long : "));
			System.out.println("Int input : "+keyboard.getInteger("Enter integer : "));
			System.out.println("Short input : "+keyboard.getShort("Enter short : "));
			System.out.println("Byte input : "+keyboard.getByte("Enter byte : "));
			System.out.println("Double input : "+keyboard.getDouble("Enter double : "));
			System.out.println("Float input : "+keyboard.getFloat("Enter float : "));
			System.out.println("Character input : "+keyboard.getCharacter("Enter characrter : "));
			System.out.println("Boolean input : "+keyboard.getInteger("Enter boolean : "));
		}catch(KeyboardException keyboardException)
		{
			System.out.println(keyboardException.getMessage());
		}
	}
}
