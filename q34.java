class EMP{
	String s=" ";
	String name="Dhrupad";
	String id="14";
	public String toString(){
		s="Name: ";
		s=s+name+" ";
		s="Id: ";
		s=s+id+" ";
		return s;
	}
}
class Scientist extends EMP{
	String no = "100";
	String experience = "Senior";
	public String toString(){
		s = s + "Number of publication: ";
		s = s+no+" ";	
		s = s + "Experience: ";
		s = s + experience ;
		return s;
	}
}
class DScientist extends Scientist{
	String award = "4";
	public String toString(){
		s = s + "Number of Award: ";
		s = s + award;
		return s;
	}
}
class q34{
	public static void main(String args[]){
		EMP ob1=new EMP();
		System.out.println(ob1.toString());
		EMP ob2=new Scientist();
		System.out.println(ob2.toString());
		EMP ob3=new DScientist();
		System.out.println(ob3.toString());
	}
}	