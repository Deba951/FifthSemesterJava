class Demo{
	void show(){
		System.out.println("I am Demo");
	}
}
class q42{
	public static void main(String args[])
	{
		try{
			Demo ob=new Demo();
			ob=null;
			ob.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	