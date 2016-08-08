import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		int arr[]={14,23,32,44,5,46,16,46};
		int r=0;
		int c=0;
		for(int l=0;l<arr.length;l++)
		{
			for(int m=l+1;m<arr.length;m++)
			{
				if(arr[l]==arr[m])
				{
					r=arr[l];
					c=1;
					break;
				}
			}
			if(c==1)
			{
				break;
			}
		}
		System.out.println("The repeated element is:"+r);
	}

}