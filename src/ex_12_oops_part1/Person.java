package ex_12_oops_part1;

public class Person {   // class person and its public, so any one can access


        // Attribute
        String name;
        byte age;
        long phone_no;
        String[] address;
        double height;
        boolean isMale;
        float salary;

        // Behaviours / functionality / methods

        void walk(){                // Non-Return with no Parameter
       System.out.println("I can walk");
        }

        void say(String msg){     // Non-Return with parameter
            System.out.println("I will say ->" +msg);
        }

        String sleep(){          // Return With No Parameter
            return "Sleep";
        }

        String eac(String item){  // Return with Parameter
            return item;
        }

}
