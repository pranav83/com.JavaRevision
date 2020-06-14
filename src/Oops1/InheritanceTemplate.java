package Oops1;

public class InheritanceTemplate {

    String fristName;
    String lastName;
    String email;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void displayTemplate(){
        System.out.println("fristName "+fristName);
        System.out.println("lastName"+lastName);
        System.out.println("email"+email);
    }
}
