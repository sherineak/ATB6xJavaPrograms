package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab207 {
    OOC.SNIC os = new OOC.SNIC();
}

class OOC{
    static int staticA =10;
    int InsB = 20;
    //static inner class
    static class SNIC{
        void show(){
            System.out.println(staticA);
            //System.out.println(InsB);  can't access instance variable in static inner class
        }
    }
}
