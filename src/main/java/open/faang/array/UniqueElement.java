package open.faang.array;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5};

        Set<Integer> set = new HashSet<Integer>();
        for(int a : arr1){
            set.add(a);
        }
        for(int b : arr2){
            set.add(b);
        }

        System.out.println(set.size());
    }
}
