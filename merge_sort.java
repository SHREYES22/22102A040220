import java.util.*;
public class merge_sort{
    public static void mergesort(int[] a,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(a,left,right);
            mergesort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }
    public  static void merge(int[] a, int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        for(int i=0;i<n1;i++){
            leftArr[i]=a[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=a[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                a[k]=leftArr[i];
                i++;
            }
            else{
                a[k]=rightArr[j];
                j++;;
            }
            k++;
            }
            while(i<n1){
                a[k]=leftArr[i];
                i++;
                k++;
            }
            while(j<n2){
                a[k]=rightArr[j];
                j++;
                k++;
            }
        
    }
	public static void main(String[] args) {
	    int[] a={64,34,25,12,22,11,90};
	    mergesort(a,0,a.length-1);
	    for(int num:a){
	        System.out.print(num+" ");
	    }
	}
}
