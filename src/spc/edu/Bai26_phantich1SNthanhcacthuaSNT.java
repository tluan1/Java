/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai26_phantich1SNthanhcacthuaSNT {
    public static void phantich(int n){
        int i = 2;
        while(n > 1){
            if(cachamchung.checkSNT(i)){
                if(n%i == 0){
                    System.out.print(i+".");
                    n/=i;
                }
                else i++;
            }
            else i++;
        }
    }
    public static int nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check){
            System.out.print("");
            try{
                n = sc.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Ban can nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return(n);
    }
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = nhap();
        System.out.print("n = ");
        phantich(n);
    }
}
