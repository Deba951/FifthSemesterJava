import java.util.*;
class q21{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		double sum=0.0;
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			if(i%2==1){
				sum=sum+Math.pow(i,i);
			}
			else
				sum=sum-Math.pow(i,i);
		}
		System.out.println(sum);
	}
}
			
		