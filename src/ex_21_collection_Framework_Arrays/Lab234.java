package ex_21_collection_Framework_Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Sherine");
        myList.add("Antony");
        myList.add("Mariyam");

        //To Print
        System.out.println("---Print1----");
        for(String mList : myList){
            System.out.println(mList);
        }

        System.out.println("-----Print2----");
        for(int i =0; i < myList.size();i++){
            System.out.println(myList.get(i));
        }

        System.out.println("-----print3------");
        //Iterator is an interface
        Iterator<String> itr = myList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
