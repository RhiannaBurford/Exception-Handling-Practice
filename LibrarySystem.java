public class LibrarySystem {

    private double fineBalance = 15.50;

    public void borrowBook(String bookTitle) throws OverdueFineException{
        if (fineBalance > 0){
            throw new OverdueFineException("You cannot borrow book. You have outstanding fines.");
        }
        else {
            System.out.println("Book successfully borrowed");
        }
    }

    public void processRequest(){
        try {
            borrowBook("The Great Gatsby");
        }
        catch (OverdueFineException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
