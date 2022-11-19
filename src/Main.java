public class Main {
    public static void main(String[] args) {
        Person vasya = new Person(" vasya");
        Person petya = new Person();
        Person maxim = new Person(190, " maxim");
        System.out.println(vasya.height + vasya.n);
        System.out.println(petya.height + petya.n);
        System.out.println(maxim.height + maxim.n);

        System.out.println("");
        Student studentDaler = new Student(190, "salam popolam" ,3);
        System.out.println(studentDaler.height);
        System.out.println(studentDaler.n);
        System.out.println(studentDaler.course);
        studentDaler.tell();
    }
}