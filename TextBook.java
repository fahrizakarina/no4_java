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
public class TextBook {
    // instance variables
    private String title;
    private String author;
    private String publisher;

    /**
     * This constructor initializes the fields to the passed values.
     * @param textTitle The book's title.
     * @param auth The author's name.
     * @param pub The name of the publisher.
     */
    public TextBook(String textTitle, String auth, String pub)
    {
        title = textTitle;
        author = auth;
        publisher = pub;
    }

    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param textObject The object to copy.
     */
    public TextBook(TextBook textObject)
    {
        if( textObject != null )
        {
            title = textObject.title;
            author = textObject.author;
            publisher = textObject.publisher;
        }
    }

    /**
     * The getTitle method returns a Textbook object's title.
     * @return The value in the title field.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * The getAuthor method returns a Textbook object's author.
     * @return The value in the author field.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * The getPublisher method returns a Textbook object's publisher.
     * @return The value in the publisher field.
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     * The setTitle method stores a value in the title field.
     * @param title the value to store in title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * The setAuthor method stores a value in the author field.
     * @param author the value to store in author
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    /**
     * The setPublisher method stores a value in the publisher field.
     * @param publisher the value to store in publisher
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    /**
     * The set method sets a value for each field.
     * @param textTitle The book's title.
     * @param auth The author's name.
     * @param pub The name of the publisher.
     */
    public void set(String textTitle, String auth, String pub)
    {
        setTitle(textTitle);
        setAuthor(auth);
        setPublisher(pub);
    }

    /**
     * The toString method returns a string representing the state of the object.
     * @return A string containing the textbook information.
     */
    @Override
    public String toString()
    {
        // Create a string representing the object.
        String str =    String.format("\n%-20s %s", "Title:", title) +
                        String.format("\n%-20s %s", "Author::", author) +
                        String.format("\n%-20s %s", "Publisher:", publisher);

        // Return the string.
        return str;
    }

    /**
     * The equals method compares two TextBook objects. The result is true if the argument 
     * is not null and is a TextBook object with the same values for all fields as this object.
     * @param obj The object to compare this TextBook against.
     * @return true if the given object has the same value for all fields.
     */
    @Override
    public boolean equals(Object obj)
    {
        if( !(obj instanceof TextBook))
            return false;
        
        // we already know that obj is of type TextBook, so it's safe to cast
        TextBook text = (TextBook) obj;
        
        // return true or false depending on whether title, author, and publisher have 
        // the same value
        return title.equals(text.title) 
                && this.author.equals(text.author) 
                && this.publisher.equals(text.publisher);

    }
    
    /**
     * The copy method creates a new TextBook object and initializes it with the same data in the 
     * calling object.
     * @return a reference to the new object.
     */
    public TextBook copy()
    {
        TextBook copyObject = new TextBook(this.title, this.author, this.publisher);
        
        return copyObject;
    }
}
