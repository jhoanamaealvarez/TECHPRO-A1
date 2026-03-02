class Student {
    String name;

    void displayName() {
            System.out.println("Student Name: " + name);
        }
    }

public class Main {
    public static void main(String[] args) {
    	
    try{
            Student s1 = new Student();
            s1.name = "Jhoana Mae Alvarez";
            
                   s1.displayName();
                                                         
                   	                    
        } catch (Exception e) {
            System.out.println("Error: Student object is not created.");
        }
    }
}
