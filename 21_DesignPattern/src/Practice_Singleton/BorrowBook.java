package Practice_Singleton;
class BorrowBook {
    private BookSingleTon borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        borrowedBook = BookSingleTon.borrowBook();

        if (borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "We do not have a this book! ";
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
class Main{
    public static void main(String[] args) {

    }
}
