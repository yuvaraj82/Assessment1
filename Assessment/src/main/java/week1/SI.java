package week1;

public class SI {
	static int principleAmount;
	static int rateInterest;
	static int tenure;
	static int simpleInterest;
	static int totalAmount;
	
	void simpleInterest(int principleAmount,int rateInterest,int tenure)
	{
		simpleInterest=(principleAmount*rateInterest*tenure)/100;
		System.out.println("Simple Interest is= "+simpleInterest);
		totalAmount=(principleAmount+simpleInterest);
		System.out.println("Total amount to be paid= "+totalAmount);
		
		
	}


}
