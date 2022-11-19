public class Student extends Person{
    int course = 1;

    public Student(){

    }
    public Student(int l, String name1, int course){
        super(l, name1);
        this.course = course;
    }
    public void tell(){
        System.out.println("Иду на занятия");
    }
}
