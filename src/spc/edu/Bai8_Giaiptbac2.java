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
public class Bai8_Giaiptbac2 {
    public static void main(String[] args) {
        System.out.println("Giai pt bac 2");
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        
        if(a == 0)
            if(b == 0)
                if(c != 0){
                    System.out.println("PT vo nghiem");
                }
                else {
                    System.out.println("PT co vo so nghiem");
                }
            else {
                System.out.println("PT co nghiem x1 = x2 = " + (-c / b));
            }
        else {
            delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("PT vo nghiem");
            else {
                if (delta == 0)
                    System.out.println("PT co nghiem " + ((-b) / (2 * a)));
                else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("PT co 2 nghiem phan biet" + "x1 = " + x1 +" x2 = "  + x2);
                }
            }
        }
            
    }
    
}
