class lab81{

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z;
		try{
		z=x*y;
		System.out.print("multiplication is :"+z);
		}catch(Exception e){
			System.out.print(e);
		}

		

	}
}