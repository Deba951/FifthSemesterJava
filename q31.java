class Demo{
	int a;
	Demo(int i){
		a=i;
	}
	boolean check(Demo ob){
		return(ob.a==a);
	}
}
class q31{
	public static void main(String args[]){
		Demo ob1=new Demo(10);
		Demo ob2=new Demo(10);
		System.out.println(ob1.check(ob2));
	}
}
	