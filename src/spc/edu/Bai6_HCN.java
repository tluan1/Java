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
public class Bai6_HCN {
    public static void main(String[] args) {
        System.out.println("Tinh hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        double a,b,s,p;
        System.out.println("Nhap chieu dai");
        a = sc.nextDouble();
        System.out.println("Nhap chieu rong");
        b = sc.nextDouble();
        p = (a + b) * 2;
        System.out.println("Chu vi HCN la: " + p);
        s = a * b;
        System.out.println("Dien tich HCN la: " + s);
    }
}
