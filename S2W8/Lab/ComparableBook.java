package S2W8.Lab;

public class ComparableBook implements Comparable<ComparableBook> {

    private int ID;
    private String bookName;
    
    // Constructor
    public ComparableBook(int ID, String bookName) {
        this.ID = ID;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return this.bookName;
    }

    @Override
    public int compareTo(ComparableBook o) {
        return this.ID - o.ID;
    }
    
}
