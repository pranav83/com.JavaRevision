package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArraylist<list> {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(2,4,5,1,6,7,3,9,8,0));
        System.out.println(list);
        // Now I want to sort this list I will use Collections for this
        Collections.sort(list);
        System.out.println(list);
    }
}