package ex_14_SingleInheritance;

public class Java extends Programming {
    String feature;

    Java() {
        System.out.println("Default constructor - java class");
    }

    public Java(String feature) {
        this.feature = feature;
    }
    void printInfo(){
        System.out.println("Feature ->" + feature);
    }
}
