class q4{
	float r,h;
	q4(float r, float h){
		this.r=r;
		this.h=h;
	}
	void area(){
		float area=(22/7)*r*h+(22/7)*r*r;
	System.out.println("The area is"+area);
	}
	void volume(){
		float vol=(22/7)*r*r*h;
		System.out.println("The volume="+vol);
	}
	public static void main(String args[]){
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		q4 ob=new q4(a,b);
		ob.area();
		ob.volume();
	}
}

	