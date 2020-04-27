package oop;

class Person{

    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(email);
    }

    void sleep(){
        System.out.println((name + " is sleeing"));
    }

}

public class Demo {
    public static void main(String[] args) {
        // Instantiating the object
        Person person1 = new Person();
        //Define some properties
        person1.name = "Joe";
        person1.email = "joe@gmial.com";


        //Abstraction (getting information from that object)
        person1.walk();

        ///

        person1.sleep();
        person1.eat();


        Person person2 = new Person();

        person2.name = "Sarah";
        person2.sleep();



        /*
        //Person


        // Attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "joe@gmail.com";
        String phone = "6477824944";

        //Action,activity, behavior
       // System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");

        //What if we wanted to do this for another person

        String name2 = "Sarah";
        String email2 = "sarah@gmail.com";
        String phone2 = "6477824934";

        //Action,activity, behavior
       // System.out.println(name2 + " is walking");
        walking(name2);
        System.out.println(name2 + " is eating");

        //What about binding attibutes and properties together
    }

        // Enhance by adding functions to minimize code
        static void walking(String name){
            System.out.println(name + " is walking");
      */
        }


}

