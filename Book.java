/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Austin Nass)
 * @version (09.10.2024)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; //Exercise 2.85
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; //Exercise 2.85
        refNumber = "";
        courseText = bookCourseText;
    }
    //Exercise 2.83
    public boolean isCourseText()
    {
        return courseText;
    }
    public String getAuthor()
    
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    //Exercise 2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails() 
    {    //Exercise 2.85
        System.out.printf("The author of the book is %s: \nThe title of the book is %s: \nThe book has %d pages: ",author, title, pages);
        if (refNumber.length() == 0){
            System.out.println("\nThe reference number of the book is ZZZ ");
        } else {
            System.out.println("\nThe reference number of the book is "+refNumber);
        }
        System.out.printf("The book is borrowed for %d times. ", borrowed);
    }
    public void setRefNumber(String ref)
    {
        if (refNumber.length()>=3) {
            refNumber = ref;
        } else {
            System.out.println("There is an error. ");
        }
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
}

