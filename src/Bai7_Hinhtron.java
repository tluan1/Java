/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai7_Hinhtron {
    public static void main(String[] args) {
        System.out.println("Tinh hinh tron");
        double r, s, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = sc.nextDouble();
        p = 2 * Math.PI * r;
        System.out.println("Tinh chu vi" + p);
        s = Math.PI * r * r;
        System.out.println("Tinh dien tich" + s);
    }
    
}
