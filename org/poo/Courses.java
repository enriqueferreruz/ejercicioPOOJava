package org.poo;

import java.util.ArrayList;

public class Courses {
	String courseName;
	String profesorName;
	int year;
	
	private static ArrayList<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Veronica"); students.add("Miguel"); students.add("Paulina");
		students.add("Saul"); students.add("Dafne"); students.add("Jose Manuel");

	}//main

	   public void enroll(Student student){
		      //TODO add the student to the collection
		   students.add(student);
		   
		   }//enroll

		   public void unEnroll(Student student){
		       //remove this student from the collection
		       // Hint: check if that really is this student
			   if (students!=null) {
				   students.remove(student);

			   }
		   }//unEnroll

		   public int countStudents(){
		       //implement
		       return students.size();
		   }//countStudents
		   
		   public int bestGrade(Student grade){
		       //TODO implement
			   int best = Integer.MAX_VALUE;
		        
		        return best;
		   }//bestGrade

}//classCourses
