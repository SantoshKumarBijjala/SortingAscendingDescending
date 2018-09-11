package Assignment1;

public class SortA_D {
	public static int[] a_DSort(int[]a)
	{
		int t;
		int m=a.length/2;
		int n=(a.length/2)+1;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		
			for(int j=m;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			
		}
		
		return a;
	}

	public static void main(String[] args) {
int []a= {1,3,5,4,9,7,6,10};
int ans[]=a_DSort(a);
for(int i=0;i<a.length;i++)
{
System.out.print(ans[i]+" ");
	}}

}
