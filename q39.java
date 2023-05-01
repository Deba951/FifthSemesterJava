import java.util.*;
class q39{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=0;
		for(int i=1;i<n;i++){
			float f = 1;
			for(int j=1;j<=i;j++){
				f = f*j;
			}
			if(i%2==0){
				sum=sum+1/f;
			}
			else
				sum=sum-1/f;
		}
		System.out.println(sum);
	}
}