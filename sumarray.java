/*8) C++ Program to find sum of elements in a given array
int arr[] = {'1','3','7'};
1+3+7 = 11 */
class sumarray
{
	public static void main(String[]args)
	{
		int i,n,sum=0;
		int arr[]={1,3,7};
		n=3;
		for(i=0;i<3;i++)
		{
		sum+=arr[i];
		}
		System.out.println("sum of array is "+sum);
	}
}