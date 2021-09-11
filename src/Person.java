public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printPerson(){
        System.out.println("Person's name: " + this.name + ", Person's Age: " + this.age);
    }
}
