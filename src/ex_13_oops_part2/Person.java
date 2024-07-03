package ex_13_oops_part2;

public class Person {
    String name;
    int age;


    //parameterized constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args){
        Person person1 = new Person("John", 30);
        Person person2 = new Person(person1);
        Person person3 = new Person(person1);
        Person person4 = new Person(person1);
        System.out.println(person2.name + " is " + person2.age + " years old");
    }
}
