import java.util.Arrays;
class SwapingNumber{
    public static void main(String args[]) {
        int arr[] = {1,3,4,5,6,0,4,0,5,7,0};
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >=1) {
                temp[j] = arr[i];
                j++;
            }
        }
        /*for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
               temp[j] = arr[i];
               j++;
            }
        }*/
        System.out.println(Arrays.toString(temp));
    }
}

