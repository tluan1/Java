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
public class Bai27_lietkecacSNTnhohonsochotruoc {
    public static void lietke(int n){
        System.out.print(" 2 ");
        for(int i = 3; i < n; i+= 2){
            if(cachamchung.checkSNT(i))System.out.print("" + i);
        }
    }
    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check){
            System.out.print("");
            try{
                n = sc.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai..");
                sc.nextLine();
            }
        }
        return(n); 
    }
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = nhap();
        System.out.println("Cac so nguyen to nho hon " + n + "");
        lietke(n);
    }
}
