import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // can make string float and boolean also
        //add elements
        list.add(0);
        list.add(5);
        list.add(10);
        //for get elements
        int element=list.get(0);
        System.out.println(element);
        // add element in between
        list.add(1,10);
        System.out.println(list);
        //change existing element
        list.set(2,15);
        System.out.println(list);
        //remove elements
        list.remove(0);
        System.out.println(list);
        //finding size of elements
        int size = list.size();
        System.out.println(size);
        //loops in list
        for (int i=0; i< list.size();i++){
            System.out.println(list.get(i));
        }
        //sorting list in array list
        Collections.sort(list);
        System.out.println(list);


    }

}
