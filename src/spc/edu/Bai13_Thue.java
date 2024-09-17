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
public class Bai13_Thue {
    public static void main(String[] args) {
        System.out.println("tinh thue");
        Scanner sc = new Scanner(System.in);
        double luong, thuong, thunhap, thue;
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
        System.out.println("Nhap thuong: ");
        thuong = sc.nextDouble();
        System.out.println("Thue thu nhap: ");
        thunhap = luong + thuong;
        if (thunhap < 9){
            System.out.println("Khong dong thue");
        }
        else if (9 < thunhap && thunhap < 15){
            thue = thunhap * 0.1;
            System.out.println("thue la" + thue); 
        }
        else if (15 < thunhap && thunhap < 30){
            thue = thunhap * 0.15;
            System.out.println("thue la: " + thue); 
        }
        else {
        thue = thunhap * 0.2;
        System.out.println("thue la: " + thue);
        }
    }
}
