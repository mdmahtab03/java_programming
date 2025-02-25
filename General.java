class Generic<t1,t2>{
	t1 obj1;
	t2 obj2;
	Generic(t1 value,t2 value2){
		obj1=value;
		obj2=value2;
	}
	void getType(){
		System.out.println("value of first variable"+obj1);
		System.out.println("value of 2nd variable"+obj2);
	}
}
class General{
	public static void main(String args[]){
		Generic<Integer,Integer> obj=new Generic<Integer,Integer>(12,43);
		obj.getType();
		
	}
} 