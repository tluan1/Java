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
public class Bai16_Tinhtiendien {
    public static void main(String[] args) {
        System.out.println("Tinh tien dien");
        Scanner sc = new Scanner(System.in);
        double chisocu, chisomoi, tieuthu, thanhtien = 0, tieuthu;
        System.out.print("Nhap chi so cu (kwh): ");
        chisocu = sc.nextDouble();
        System.out.print("Nhap chi so moi (kwh): ");
        chisomoi = sc.nextDouble();
        tieuthu = chisomoi - chisocu;
        double [] mocArray = {50, 100, 200, 300, 400, 500};
        double [] giaArray = {1806, 1866, 2167, 2729, 3050, 3151};
        double moc = 0;
        for(int i = 0; i <= mocArray. length; i++){
            if (tieuthu > mocArray[i]){
                thanhtien += (mocArray[i] - moc) * giaArray[i];
                moc = mocArray[i];
            }
            else
            {
                thanhtien += (tieuthu - moc) * giaArray[i];
                moc = tieuthu;
            }
        }
        if (tieuthu > 400)
            thanhtien += (tieuthu - 400) * giaArray[5];
        }
        System.out.printf("So tien dien phai tra la: %.2f(VND)\n ", thanhtien);
    }
}