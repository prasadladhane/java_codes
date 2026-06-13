class BankInfo{

	int custId;
	double bankBalance;
	String custName;
	long accountNum;

	void customerInfo(){
		System.out.println("Customer Name:"+custName);
		System.out.println("Customer Id:"+custId);
		System.out.println("Account Number:"+accountNum);
		System.out.println("Bank Balance:"+bankBalance);
	}

	public static void main(String[]args){
		BankInfo obj=new BankInfo();
		
		obj.custName="Tom Halland";
		obj.custId=2026;
		obj.accountNum=1876543216;
		obj.bankBalance=854525.20;

		obj.customerInfo();

	}
}
