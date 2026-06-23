public class Main {

    public static void main(String[] args) {

        Person p0 = new Person("John", "P001");
        Person p1 = new Student("Ali", "S001");
        Person p2 = new Lecturer("Ahmed", "L001");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}