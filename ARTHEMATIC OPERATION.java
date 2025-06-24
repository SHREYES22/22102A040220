import java.util.*;
public class Main
{
    public static int add(int num1,int num2){
        int sum=(num1+num2);
        return sum;
    }
    public static int sub(int num1,int num2){
        int sol=(num1-num2);
        return sol;
    }
    public static int mul(int num1,int num2){
        int sol=(num1*num2);
        return sol;
    }
    public static double did(double num1,double num2){
        double sol=(num1/num2);
        return sol;
    }
	public static void main(String[] args) {
		System.out.println(add(5,6));
		System.out.println(sub(10,6));
		System.out.println(mul(10,6));
		System.out.printf("%.2f%n",did(10,3));
	}
}
