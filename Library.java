import java.util.ArrayList;

public class Library {
    private ArrayList<String> book;
    private ArrayList<String> User;
    private ArrayList<String> Employee;

    public Library(ArrayList<String> book, ArrayList<String> user, ArrayList<String> employee) {
        this.book = book;
        User = user;
        Employee = employee;
    }

    public ArrayList<String> getBook() {
        return book;
    }

    public void setBook(ArrayList<String> book) {
        this.book = book;
    }

    public ArrayList<String> getUser() {
        return User;
    }

    public void setUser(ArrayList<String> user) {
        User = user;
    }

    public ArrayList<String> getEmployee() {
        return Employee;
    }

    public void setEmployee(ArrayList<String> employee) {
        Employee = employee;
    }
}
