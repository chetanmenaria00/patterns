public class diamondpattern {
    public static void main(String[] args) {    
        int n=5;
        for(int i=0;i<n;i++) 
        {
            for(int j=n-(i+1);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--) 
        {
            for(int j=n-(i+1);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
