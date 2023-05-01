import java.util.*;
class q40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String f_name = sc.nextLine();
		String m_name = sc.nextLine();
		String l_name = sc.nextLine();
		String roll = sc.nextLine();
		String ans = "";
		if(m_name==null)
			System.exit(0);
		else{
		ans = ans+ f_name.charAt(0);
		ans = ans+m_name.charAt(0);
		ans = ans+l_name.charAt(0);
		ans= ans+roll.substring(roll.length()-4,roll.length());
		System.out.println(ans);
	}
		
	}
}