package TheSecretMessagDecoder;

import java.util.Scanner;

public class TheMsgDecodeApp {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		theSecretMessagDecoder sm=new theSecretMessagDecoder();
		System.out.println( sm.decodeCharacter(ch));
		sc.close();
	}
	
}
