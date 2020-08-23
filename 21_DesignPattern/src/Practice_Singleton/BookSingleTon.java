package Practice_Singleton;

public class BookSingleTon {
    private String author;
    private String title;
    private static BookSingleTon bookSingleTon;
    private static boolean isLoanedOut;

    private BookSingleTon() {
        author = "Gamma,Helm,John ";
        title = "Design Pattern";
        bookSingleTon = null;
        isLoanedOut = false;
    }

    public static BookSingleTon borrowBook() {
        if (!isLoanedOut) {
            if (bookSingleTon == null) {
                bookSingleTon = new BookSingleTon();
            }
            isLoanedOut = true;
            return bookSingleTon;
        }
        return null;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public  String getAuthorAndTitle(){
        return getTitle() + getAuthor();
    }
    public void returnBook(BookSingleTon bookSingleTon){
        isLoanedOut = false;
    }
}

