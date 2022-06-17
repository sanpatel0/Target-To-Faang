package open.faang.array;

/**
 * N = 5
 * A[] = {1, 2, 3, 4, 5}
 * Output:
 * 5 1 2 3 4
 */

public class RotetArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int lastElement = arr[arr.length-1];
        int[] temp = new int[arr.length];
        int j = 1;
        temp[0] = lastElement;
        for(int i = 0;i<=arr.length-2;i++){
            temp[j] = arr[i];
            j++;
        }
        for(int t : temp){
            System.out.println(t+" ");
        }
    }
}
