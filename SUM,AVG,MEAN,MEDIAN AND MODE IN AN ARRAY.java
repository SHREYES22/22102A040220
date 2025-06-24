import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int avg=sum/n;
        int mean=avg;
        int median;
        int mode;
        if(n%2==0){
            int c=(n-1)/2;
            int d=((n-2)/2)+1;
            median=(a[d]+a[c])/2;
        }
        else{
            median=a[(n-1)/2];
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println("MODE:"+a[i]);
                }
            }
        }
        System.out.println("SUM:"+sum);
        System.out.println("AVERAGE:"+avg);
        System.out.println("MEAN:"+mean);
        System.out.println("MEDIAN:"+median);
    }
}
