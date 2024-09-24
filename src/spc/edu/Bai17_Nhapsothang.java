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
public class Bai17_Nhapsothang {
    public static void main(String[] args) {
        System.out.println("Tinh so thang: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang : ");
        int sothang = sc.nextInt();
        System.out.println("Nhap nam: ");
        int sonam = sc.nextInt();
        System.out.println("Thang " + sothang + " co 31 ngay ");
        System.out.println("Thang " + sothang + " co 30 ngay ");
        System.out.println("Thang " + sothang + " co 28 hoac 29 ngay ");
    }
}
