class Person{
    static String firstName = "Akshat";
    static String lastName;
    static int age = 22;

    public Person(String lastName) {
        Person.lastName = lastName;
    }

    //First Name from static block
    static{
        System.out.println("First Name is " + firstName);
    }

    //Last Name from static method
    public static void lastName(){
        System.out.println("Last Name is " + lastName);
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Person akshat = new Person("Srivastava");
        Person.lastName();
        //
        System.out.println(Person.age);
    }
}
