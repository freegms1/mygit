public class Example13 {
//    Person 객체를 두 개 생성하고, 각 객체에 대한 정보를 출력하세요.
//    이어서 Book 객체를 생성하고, 그 정보를 출력하세요.
public static void main(String[] args) {


    Person person1 = new Person("minseok", 30);
    Person person2 = new Person("hyungwoo", 29);
    person1.introduce();
    person2.introduce();
    Book book = new Book("자바기초", "김민석", 7000);
    book.printPrice();
    book.printAuthor();
    book.printTitle();
}
}
