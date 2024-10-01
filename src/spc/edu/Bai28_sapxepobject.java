/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
import spc.edu.moi.Sinhvien;
/**
 *
 * @author Administrator
 */
public class Bai28_sapxepobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten;
        double diem;
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        Sinhvien sv[] = new Sinhvien[n];
        for(int i = 0; i < n; i++){
            sv[i] = new Sinhvien();
            System.out.print("Nhap ten sinh vien: ");
            ten = sc.nextLine();
            sv[i].setTen(ten);
            System.out.print("Nhap diem: ");
            diem = sc.nextDouble();
            sv[i].setdiem(diem);
            sc.nextLine();
        }
        
        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                if(sv[x].getdiem() < sv[y].getdiem()){
                    Sinhvien tam = new Sinhvien();
                    tam = sv[x];
                    sv[x] = sv[y];
                    sv[y] = tam;
                }
            }
        }
        for (int j = 0; j < n; j++){
            System.out.print("Ho va ten SV: " + sv[j].getTen());
            System.out.print("Diem sv: " + sv[j].getdiem());
            if(sv[j].getdiem()<5){
                System.out.println("Hoc luc yeu");
            }
            else if(sv[j].getdiem()<=6){
                System.out.println("Hoc luc trung binh");
            }
            else if(sv[j].getdiem()<8){
                System.out.println("Hoc luc kha");
            }
            else{
                System.out.println("Hoc luc gioi");
            }
        }
    }
}
