package ie.atu;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        StudentApp student1 = new StudentApp();
        StudentApp student2 = new StudentApp( "David");
       StudentApp student3 = new StudentApp("Rayan" , "Rayan@gmail.com","Computer science");

        System.out.println("Student 1 , please enter your name ");
        student1.setName(myinput.next());
        System.out.println("");
        System.out.println("Now please enter your email");
        student1.setEmail(myinput.next());
        System.out.println("");
        System.out.println("Last please enter your course");
        student1.setcourse(myinput.next());

        System.out.println("");
        System.out.println(" David");
     System.out.println(" please enter youe Email");
        student2.setEmail(myinput.next());
        System.out.println("");
        System.out.println("Please enter your course");
        student2.setcourse(myinput.next());
        System.out.println("");

        System.out.println("Student 1, your information is  ");
        System.out.println(student1.getName());
        System.out.println(student1.getEmail());
        System.out.println(student1.getcourse());

     System.out.println();
        System.out.println("Student 2, your information is  ");
        System.out.println(student2.getName());
        System.out.println(student2.getEmail());
        System.out.println(student2.getcourse());
     System.out.println();
        System.out.println("Student 3, your information is  ");
        System.out.println(student3.getName());
        System.out.println(student3.getEmail());
        System.out.println(student3.getcourse());

    }
}
