/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Tinhhinhhoc {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Hinhhoc h;
        h = new Hinhchunhat(4, 5);
        System.out.println("Chu vi = " + h.tinhchuvi());
        System.out.println("Dien tich = " + h.tinhdientich());
        System.out.println("-------------");
        h = new Hinhvuong(5);
        System.out.println("Chu vi = " + h.tinhchuvi());
        System.out.println("Dien tich = " + h.tinhdientich());
        Hinhchunhat hcn = new Hinhvuong(5);
        System.out.println("-------------");
        System.out.println("Chu vi = " + h.tinhchuvi());
        System.out.println("Dien tich = " + h.tinhdientich());
    }
}
