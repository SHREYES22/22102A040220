import java.util.*;
public class sorted_or_not{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                c=0;
            }
            else{
                c++;
            }
        }
        if(c==0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
