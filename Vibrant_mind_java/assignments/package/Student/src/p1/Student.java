package p1;
public class Student{
	int rollNo;
	String name;
	double marks;
 

	public Student(int roll , String name , double marks){
		this.rollNo=roll;
		this.name = name;
		this.marks = marks;
	}
	public void displayStudentInfo(){
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Marks"+marks);
	} 

	int getRollNo(){return rollNo ;}
	String getName(){return name;}
	double getMarks(){return marks;}

	void SetRollNo(int no){
	        rollNo = no;  
	}
	void SetName(String n){
	        name = n;  

	}
	void SetMarks(double m){
	        marks = m;  

	}

	void getGrade(double marks){
		if(marks>=90)  System.out.println("A+");
		else if(marks>=80 && marks<90)  System.out.println("A");
		else if(marks>=70 && marks<80)  System.out.println("B");
		else if(marks>=60 && marks<70)  System.out.println("C");
		else if(marks>=50 && marks<60)  System.out.println("D");
		else if(marks>=40 && marks<50)  System.out.println("E");
		else  System.out.println("Fail!!!");
	}

}