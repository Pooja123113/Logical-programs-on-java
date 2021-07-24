import java.util.Scanner;
class vowel
{
	public static void main(String[]args)
	{
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		ch=s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
		System.out.println("character "+ch+" is vowel");
		}
		else
		{
		System.out.println("character "+ch+" is consonanat");
		}
	}
}