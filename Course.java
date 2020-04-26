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
public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;
    

    /**
     * This constructor initializes the fields to the passed values.
     * @param name The name of the course.
     * @param instr An Instructor object.
     * @param text A TextBook object.
     * @param students An ArrayList of Student objects.
     */
    public Course(String name, Instructor instr, TextBook text)
    {
        // courseName.
        courseName = name;

        // Create a new Instructor
        instructor = new Instructor(instr);
        
        // Create a new TextBook object
        textBook = new TextBook(text);
        
  
  
        
    }

    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param object2 The object to copy.
     */
    public Course(Course object2)
    {
        if( object2 != null )
        {
            // Assign the courseName.
            courseName = object2.courseName;

            
            // constructor.
            instructor = new Instructor(object2.instructor);

            
            // constructor.
            textBook = new TextBook(object2.textBook);

            
            
            
        }
    }

    /**
     * The getCourseName method returns a Course object's name.
     * @return The value in the course name field.
     */
    public String getCourseName()
    {
        return courseName;
    }

    /**
     * The getInstructor method returns a Course object's instructor.
     * @return A reference to a copy of this course's Instructor object.
     */
    public Instructor getInstructor()
    {
        // Return a copy of the instructor object.
        return new Instructor(instructor);
    }

    /**
     * The getTextBook method returns a Course object's textbook.
     * @return A reference to a copy of this course's TextBook object.
     */
    public TextBook getTextBook()
    {
        // Return a copy of the textBook object.
        return new TextBook(textBook);
    }
    
    /**
     * The setCourseName method stores a value in the courseName field.
     * @param courseName the value to store in courseName
     */
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    /**
     * The setInstructor method stores a value in the instructor field.
     * @param instructor the value to store in instructor
     */
    public void setInstructor(Instructor instructor)
    {
        // Create a copy of the passed object.
        this.instructor = new Instructor(instructor);
    }

    /**
     * The setTextBook method stores a value in the textBook field.
     * @param textBook the value to store in textBook
     */
    public void setTextBook(TextBook textBook)
    {
        // Create a copy of the passed object.
        this.textBook = new TextBook(textBook);
    }
    
    /**
     * The toString method returns a string representing the state of the object.
     *
     * @return A string containing the course information.
     */
    @Override
    public String toString()
    {
        // Create a string representing the object.
        String str =    String.format("\n%-20s %s", "Course Name:", courseName) +
                        String.format("\n%-20s %s", "Instructor Information:", instructor) +
                        String.format("\n%-20s %s", "Textbook Information:", textBook);
        
        
        // Return the string.
        return str;

    }

    /**
     * The equals method compares two Course objects. The result is true if the argument 
     * is not null and is a Course object with the same values for all fields as this object.
     * @param course The object to compare this Course against.
     * @return true if the given object has the same value for all fields.
     */
    public boolean equals(Course course)
    {
        if( course == null )
            return false;
        
        // return true or false depending on whether courseName, instructor, and textBook have 
        // the same value
        return courseName.equals(course.courseName) 
                && instructor.equals(course.instructor) 
                && textBook.equals(course.textBook);

    }
    
    /**
     * The copy method creates a new Course object and initializes it with the same data in the 
     * calling object.
     * @return a reference to the new object.
     */
    public Course copy()
    {
        Course copyObject = new Course(this.courseName, this.instructor, this.textBook);
        
        return copyObject;
    }
}
