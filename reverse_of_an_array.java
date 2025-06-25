import java.util.*;
public class reverse_of_an_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int j=n-1;
        for(int i=0;i<n;i++){
            b[i]=a[j];
            System.out.print(b[i]+" ");
            j--;
        }
    }
}
