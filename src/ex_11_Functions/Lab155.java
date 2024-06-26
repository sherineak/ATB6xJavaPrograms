package ex_11_Functions;

public class Lab155 {
    public static void main(String[] args) {
        // 1 friend
        // 1 beg
        System.out.println("Starting of program");
        int money = giveMoneyFrined(100);
        System.out.println(money);

        giveMoneybeg();
        System.out.println("End Of a program");
    }

    static void giveMoneybeg() {
        System.out.println("Blessing");
    }

    static int giveMoneyFrined(int i) {
        i = i + 8;
        return i;
    }
}
