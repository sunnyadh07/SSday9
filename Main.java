import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> checkedOutBooks = new ArrayList<>();
        checkedOutBooks.add("How to be perfect");
        checkedOutBooks.add("PowerShift");
        checkedOutBooks.add("How to save money");

        User randomUser = new User("Salma", "Adhikari", "dss@fsd.com", "Salma07", checkedOutBooks, 0.50);


        Employee randomEmployee = new Employee("Sarah", "Welson", "sarag@gmail.com", "Sarah01", checkedOutBooks, "0.10");
        



    }
}
