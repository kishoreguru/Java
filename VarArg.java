class Addition{
	int total;
	int add(int... values){
		for(int index : values)
		{
			total+=index;
		}
		return total;
	}
}
class VarArg{
	public static void main(String[] args) {
		Addition obj1=new Addition();
		System.out.println("Addition :" + obj1.add(10,12,23,10,500));
		
	}

}