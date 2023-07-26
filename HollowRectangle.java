import java.util.*;
public class HollowRectangle {
    public static void Rectangle(int n,int m){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Rectangle(4,5);
    }
}
