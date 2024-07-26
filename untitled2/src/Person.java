public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("제 이름은 : %s%n", name);
        System.out.printf("제 나이는 : %d", age);
    }
}

