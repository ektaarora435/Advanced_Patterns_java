import java.util.*;
public class DecToBinary {
    public static void Decbinary(int num){
        int pow=0;
        int ans=0;
        while(num>0){
            int rem=num%2;
            ans=ans+(rem*(int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        Decbinary(7);
    }
}
