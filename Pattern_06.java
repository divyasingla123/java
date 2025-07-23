public class Pattern_06 {
    public static void main(String[] args) {

//diamond

        int n=4;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("* "); 
            }
            System.out.println();
        }




//hollow diamond

       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }             
            for (int k = 1; k <= 2*i-1; k++) {
                if(k==1 || k==2*i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
                 
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                if(k==1 || k==2*i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
                 
            }
            System.out.println();
        }

//hourglass
        
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=i-1; j++) {
                System.out.print("  ");
            }             
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                
                System.out.print("* ");
                 
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j<=i-1; j++) {
                System.out.print("  ");
            }             
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                
                System.out.print("* ");
                 
            }
            System.out.println();
        }
        
        
//hollow hourglass
        
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=i-1; j++) {
                System.out.print("  ");
            }             
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                
                    if(i==1||k==1 || k==2*(n-i)+1)
                System.out.print("* ");
                else
                System.out.print("  ");
                
                 
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j<=i-1; j++) {
                System.out.print("  ");
            }             
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                
                    if(i==1||k==1 || k==2*(n-i)+1)
                System.out.print("* ");
                else
                System.out.print("  ");
                }
                
                 
                System.out.println();
            }
        



        
  

//1
//01
//101
//0101


for (int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if (i-j==1||i-j==3){
            System.out.print("0 ");
        }
        else{
            System.out.print("1 ");
        }
    }
    System.out.println();
}


//..##..
//..##..
//##..##
//##..##
//..##..
//..##..


int ni=3;
int f=1;
for(int i=0;i<ni*2;i++){
  for (int j=0;j<ni;j++){
    if (f==1){
    System.out.print(". . ");
}
    else{
    System.out.print("# # ");
}
    f=f*-1;
}
    if (i%2==0)f=f*-1;
  System.out.println();

}
}
}
