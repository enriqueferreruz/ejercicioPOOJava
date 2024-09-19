package org.poo;


public class Main {

	public static void main(String[] args) {
	
        Courses courses = new Courses();
      
        Student student1 = new Student("Veronica", "Lopez", 1999, 6, 6);
        Student student2 = new Student("Miguel", "Perez", 2005 );
        
        courses.enroll(student1);
        courses.enroll(student2);
        
        System.out.println("Número de estudiantes inscritos: " + courses.countStudents());
        
        courses.unEnroll(student1);
        System.out.println("Número de estudiantes inscritos " + courses.countStudents());
        
       
	}//main
}//class Main


