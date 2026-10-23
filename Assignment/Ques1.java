// Custom exception in java
class LibraryException extends RuntimeException {
    public LibraryException(String mes) {
        super(mes);
    }
}

// Base class
class LibraryItem {
    private String itemId;
    protected String title;
    public int totalItems;

    LibraryItem(String titleName) {
        title = titleName;
        totalItems += 1;
    }

    public void validateId(String id) throws LibraryException {
        itemId = id;
        if (id.startsWith("LIB-")) {}
        else {
            throw new LibraryException("Dear User, library item must and should stats with the prefix LIB-");
        }
    }

    public void displayInfo() {
        System.out.println("Title is: " + title + " itemId is: " + itemId);
    }
}


// Sub-class
class Book extends LibraryItem {
    private int pageCount;

    Book() {
        super("Zeology");
    }

    public void setPageCount(int id) throws LibraryException {
        if(id < 0 || id == 0) {
            throw new LibraryException("Dear User, page count should not be zero or equals to zero");
        }
        else {
            pageCount = id;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // calls the parent version of the displayInfo()
        System.out.println("Page count: " + pageCount);
    }
}


public class Ques1 {
    public static void main(String[] args) {
        Book novel = new Book();
        
        try {
            novel.validateId("LIB-Book1");
            novel.setPageCount(0);
        }
        catch(LibraryException exe) {
            System.out.println(exe.getMessage());
        }

        novel.displayInfo();

        System.out.println("Code completed");
        System.out.println("ThankYou");
    }
}