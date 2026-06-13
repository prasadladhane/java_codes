class Demo4{
	private int sal;

	int getSalary(int sal){
		this.sal=sal;
		return sal;
	}
}

class Demo5{
	public static void main(String[]args){
		Demo4 obj=new Demo4();
		int sal=obj.getSalary(50000);
		System.out.println("Salary is: "+sal);
	}
}



