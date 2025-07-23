//sparse matrix
public class leetcode {
    public static void main(String[] args) {
        int count=0;
        int arr[][]={{1,0,0},{3,0,4},{0,5,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==0){
                count++;
               }
            }
        }
        if(count>(arr.length*arr[0].length)/2){
            System.out.println("Sparse matrix");
        }
        else{
            System.out.println("Not a sparse matrix");
        }
    }
}