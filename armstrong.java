import java.util.Scanner;
class armstrong
{
	public static void main(String[]args)
	{
	int n,c,rem,arm=0;
	System.out.println("enter the number:");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	c=n;
	while(n>0)
	{
	 rem=n%10;
	 arm=(rem*rem*rem)+arm;
	 n=n/10;
	 
	}
	if(c==arm)
	{
	System.out.println("number is armstrong number");
	}
	else
	{
	System.out.println("number is NOT armstrong number");
	}
	
	}
}