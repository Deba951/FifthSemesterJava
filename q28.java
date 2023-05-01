abstract class Test{
	public void show(){
		System.out.println("This is concrete method 1");
	}
	public void display(){
		System.out.println("This is concrete method 2");
	}
}
class q28 extends Test{
	public static void main(String args[]){
		Test ob=new q28();
		ob.show();
		ob.display();
	}
} 