import java.util.*;
class PayOutOfBoundsException extends Exception{
}
class q43{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		try{
			if(salary<10000)
				throw new PayOutOfBoundsException();
			else
				System.out.println("He is happy");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}