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
public class D2_cau2 {
    public static void main(String[] args) {
        System.out.println("Tinh hinh tron");
        Scanner sc = new Scanner(System.in);
        double r, s, v;
        System.out.println("Nhap r: ");
        r = sc.nextDouble();
        s = 4 * Math.PI * r * r;
        System.out.println("Tinh dien tich: " + s);
        v = 4/3 * Math.PI * r * r * r;
        System.out.println("Tinh the tich: " + v);
    }
}
