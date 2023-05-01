class P {
	void show() {
		System.out.println("Default Acess");
	}
}

class Q extends P {
	public void show() {
		System.out.println("Public Acess");
	}
}

// class R extends P{
// private void show(){
// System.out.println("Private Acess");
// }
// }
class q32 {
	public static void main(String args[]) {
		P ob1 = new P();
		ob1.show();
		Q ob2 = new Q();
		ob2.show();
		// R ob3=new R();
		// ob3.show();
	}
}