import java.util.Scanner;
class factorial
{
	public static void main(String[]args)
{
	int n,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println("factorial of number "+n+" is "+fact);
}

}