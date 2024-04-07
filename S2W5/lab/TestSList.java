package S2W5.lab;


public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy.");

        list.display();

        System.out.println("Removed: " + list.removeInitial());

        System.out.println("Is \"difficult\" is in the list? " + list.contains("difficult"));

        list.empty();
    }
}
