package open.faang.array;

// Move Negative value to end
public class MoveNegativeToEnd {

    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, -11, 6 };

        int [] temp = new int[arr.length];
        int j = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>=0){
                temp[j++] = arr[i];
            }
        }
        for(int i = 0;i< arr.length;i++){
            if(arr[i]<0){
                temp[j++] = arr[i];
            }
        }

        for(int a : temp){
            System.out.print(a+" ");
        }
    }
}
