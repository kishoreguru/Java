class ThisExample{
	int firstNum;
	int secondNum;
	public static void main(String[] args) {
		
		ThisExample obj1=new ThisExample();
		obj1.takeInput();
	}


	void add(int firstNum, int secondNum){
		

		int result = firstNum + secondNum;
		this.displayOutput(result);
	}

	void takeInput(){
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		this.add(firstNum, secondNum);
	}

	void displayOutput(int result){
		System.out.println("Addition : " + result);
	}




}