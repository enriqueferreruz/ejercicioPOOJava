package org.poo;

public class Student {
    String firstName;
    String lastName;
    int registration;
   public int grade;
    int year;

public void printFullName(){
    //implement
	System.out.println(firstName + " " + lastName);
 }//printFullName

 public boolean isApproved(){
	if (grade>=60) {
	 return true;
	}
     //implement: should return true if grade >= 60
	return true;

 }//isApproved

 public int changeYearIfApproved(){
     //implement: the student should advance to the next year if he/she grade is >= 60
     // Make year = year + 1, and print "Congratulations" if the student has been approved
	 if (grade >= 60) {
		 System.out.println("Congrats");
		 return year += 1;
	 }
	 return year += 1;

 }//changeYearIfApproved
 
 public Student ( String firstName, String lastName, int registration, int grade, int year) {
	   this.firstName=firstName.toUpperCase();
	   this.lastName=lastName.toUpperCase();
	   this.registration= registration;
	   this.grade=grade;
	   this.year=year;
	   
}//constructor
 
 public Student (String firstName, String lastName, int grade) {
	   this(firstName, lastName, 2000, 60, grade);
}//constructor Overloading
 
 public Student (String firstName, String lastName) {
	   this(firstName, lastName, 2000, 60, 6);
}// constructor Overloading
}//class