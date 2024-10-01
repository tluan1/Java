/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
/**
 *
 * @author Administrator
 */
public class Bai24_String01 {
    public static void main(String[] args) {
        System.out.println("Xuất thông tin");
        String fullname = "Nguyen Thanh Luan";
        System.out.println(fullname);
        System.out.println("Ho: " + fullname.substring(0, 6));
        System.out.println("Chu lot: " + fullname.substring(7, 12));
        System.out.println("Ten: " + fullname.substring(13, 17));
        System.out.println("Chu hoa: " + fullname.toUpperCase());
    }
}
