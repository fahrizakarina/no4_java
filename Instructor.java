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
public class Instructor {
    // instance variables
    private String lastName;
    private String firstName;
    private String officeNumber;

    /**
     * This constructor initializes the fields to the passed values.
     * @param lname The instructor's last name.
     * @param fname The instructor's first name.
     * @param office The office number.
     */
    public Instructor(String lname, String fname, String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param instrObject The object to copy.
     */
    public Instructor(Instructor instrObject)
    {
        if( instrObject != null )
        {
            lastName = instrObject.lastName;
            firstName = instrObject.firstName;
            officeNumber = instrObject.officeNumber;
        }
    }

    /**
     * The getLastName method returns an Instructor object's last name.
     * @return The value in the lastName field.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * The getFirstName method returns an Instructor object's first name.
     * @return The value in the firstName field.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * The getOfficeNumber method returns an Instructor object's office number.
     * @return The value in the officeNumber field.
     */
    public String getOfficeNumber()
    {
        return officeNumber;
    }

    /**
     * The setLastName method stores a value in the lastName field.
     * @param lastName the value to store in lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * The setFirstName method stores a value in the firstName field.
     * @param firstName the value to store in firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * The setOfficeNumber method stores a value in the officeNumber field.
     * @param officeNumber the value to store in officeNumber
     */
    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }
    
    /**
     * The set method sets a value for each field.
     * @param lname The instructor's last name.
     * @param fname The instructor's first name.
     * @param office The office number.
     */
    public void set(String lname, String fname, String office)
    {
        setLastName(lname);
        setFirstName(fname);
        setOfficeNumber(office);
    }

    /**
     * The toString method returns a string representing the state of the object.
     * @return A string containing the instructor information.
     */
    @Override
    public String toString()
    {
        // Create a string representing the object.
        String str =    String.format("\n%-20s %s", "Last Name:", lastName) +
                        String.format("\n%-20s %s", "First Name:", firstName) +
                        String.format("\n%-20s %s", "Office Number:", officeNumber);
        

        // Return the string.
        return str;
    }

    /**
     * The equals method compares two Instructor objects. The result is true if the argument 
     * is not null and is an Instructor object with the same values for all fields as this object.
     * @param obj The object to compare this Instructor against.
     * @return true if the given object has the same value for all fields.
     */
    @Override
    public boolean equals(Object obj)
    {
        if( !(obj instanceof Instructor))
            return false;
        
        // we already know that obj is of type Instructor, so it's safe to cast
        Instructor instr = (Instructor) obj;
        
        // return true or false depending on whether lastName, firstName, and officeNumber have 
        // the same value
        return this.lastName.equals(instr.lastName) 
                && this.firstName.equals(instr.firstName) 
                && this.officeNumber.equals(instr.officeNumber);

    }
    
    /**
     * The copy method creates a new Instructor object and initializes it with the same data as the
     * one in the calling object.
     * @return a reference to the new object.
     */
    public Instructor copy()
    {
        return new Instructor(this);
    }
}
