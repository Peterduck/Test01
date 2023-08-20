package Test;

import java.util.Scanner;

public class SoNguyenTo {
  public static void main(String[] args){
    System.out.println("Enter n number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<n;i++){
      if(i!=1 && n%Math.sqrt(i)!=0 && i%2!=0){
        System.out.println(i+" la so nguyen to");
      }
    }
  }

}
