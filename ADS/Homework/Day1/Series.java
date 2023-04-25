class Series{
	static int n=0;
	public static void print(){
		
			System.out.println(n);
		n++;
		if(n<10)
			print();
	}
	
	public static void main(String []args){
		System.out.println("Hello"); 
		print();
	}
}