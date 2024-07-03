package ex_12_oops_part1;

public class Lab164 {
    public static void main(String[] args) {

        Car tesla =  new Car();
        tesla.name= "TESLA";
        tesla.color = "Red";
        tesla.musicSystem();
        tesla.reverse();

        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.color = "Black";
        volvo.speed();
        volvo.reverse();
    }
}
