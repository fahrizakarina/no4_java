/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4_java;

/**
 *
 * @author Fahriza Karina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat Object Instructor
       Instructor myInstructor = new Instructor("", "Asmunin, S.Kom., M.Kom.", "197701102008121003");
       //Membuat Object Textbook 
       TextBook myTextBook = new TextBook("Starting Out with Java(6th Edition) ", "Tony Gaddis", "Pearson");
       //Membuat Object Course
       Course myCourse = new Course("PBO", myInstructor, myTextBook);
       //Menampilkan informasi course 
       System.out.println(myCourse);
    }
    
}
