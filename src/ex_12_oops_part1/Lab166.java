package ex_12_oops_part1;

public class Lab166 {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.Sname = "Sherine";
        stu.age = 25;
        stu.Gender = "Female";
        stu.Educations();
        stu.techSkills();

        Course co = new Course();
        co.Cname = "Java";
        co.cDuration = 2;
        co.cFee = 10000;
        co.cProcess();

        Payment pa = new Payment();
        pa.pType = "Google Pay";
        pa.pProcess();



    }
}
