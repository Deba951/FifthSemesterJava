import java.util.*;
class q36{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c=s.toCharArray();
		Arrays.sort(c);
		String ans="";
		for(int i=0;i<c.length;i++){
			ans=ans+c[i];
		}
	System.out.println(ans);
	}
}