import java.util.*;
public class max_min_element{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=a[0],d=a[0];
        for(int i=0;i<n;i++){
                if(a[i]<c){
                c=a[i];
            }
            else if(a[i]>d){
                d=a[i];
            }
            }
            System.out.println(c);
            System.out.println(d);      
}
}
