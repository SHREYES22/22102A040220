import java.util.*;
public class even_odd_elements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c++;
            }
            else{
                d++;
            }
        }
        System.out.println(c);
        System.out.println(d);
    }
}
