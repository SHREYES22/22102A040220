import java.util.*;
public class sum_of_two_arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[i]+b[i];
            System.out.print(c[i]+" ");
        }
    }
}
