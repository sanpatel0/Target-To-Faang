package open.faang.array;

public class ReverseArray1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //reverse(arr);
        reverseArray(arr);
        for(int a : arr)
        System.out.print(a+",");
    }

    // Optimal solution
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start ++;
            end --;
        }
    }

    // array reverse using brut force
    private static void reverse(int[] arr) {
    for(int i = arr.length-1;i>0;i--){
        System.out.print(arr[i]+",");
    }
    }
}
