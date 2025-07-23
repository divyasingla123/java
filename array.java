// public class array {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,2,5,2};
//         int n=arr.length;
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==2){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int arr[]={98,12,34,56,78,90};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
