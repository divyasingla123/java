// public class Array_03{
//     public static void main(String[] args) {
//         int arr[] = {10,20,30,40,50};
//         int element = 35;
//         int index =4;
//         int arr1[] = new int[arr.length+1];

// // //insertion

//         System.out.println("INSERTION");
//         for(int i=0;i<index;i++){
//             arr1[i] = arr[i];
//         }
//         for(int i=arr.length-1;i>=index;i--) {
//             arr1[i+1]=arr[i];
//         }
        
//         arr1[4] = 35;
        
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         for(int i=0;i<arr1.length;i++){
//             System.out.print(arr1[i]+" ");
//         }
//         System.out.println();
        
        
//         //  //deletion
        
//         System.out.println("DELETION");
        
        
//         for (int i=0;i<arr.length;i++){
//             if(i==index){
//                 continue;
//             }
//             if (i<index)arr[i]=arr[i];
//             else arr[i]=arr1[i+1];
//         }
        
//         for(int i=0;i<arr1.length;i++){
//             System.out.print(arr1[i]+" ");
//         }
        
//         System.out.println();
        
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

// // // sum

// System.out.println("ADDITION");
// int count=-1;
// int sum=0;
// for (int i=0;i<arr.length;i++){
//     count+=1;
//     sum+=arr[i];
// }
// System.out.println("COUNT: "+count+ " " + "SUM: "+sum);

//     }
// }