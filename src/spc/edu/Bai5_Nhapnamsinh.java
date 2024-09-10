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
public class Bai5_Nhapnamsinh {
    public static void main(String[] args) {
        System.out.println("Chuong trinh QLSV");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho ten");
        String hoten = sc.nextLine();
        System.out.println("Nhap nam sinh");
        int namsinh = sc.nextInt();
        System.out.println("Chao ban " + hoten);
        int tuoi = 2024 - namsinh;
        System.out.println("So tuoi cua ban la:" + tuoi);
    }
}
