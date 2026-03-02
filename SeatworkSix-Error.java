class Student {
    String name;

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = null;
        s1.displayName();
    }
}
