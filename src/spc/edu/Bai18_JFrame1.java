/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class Bai18_JFrame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vi du JFrame don gian");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        //Tạo 1 JPanel
        JPanel panel = new JPanel();
         //Tạo 1 nút
        JButton button = new JButton("Nhan toi!");
       //Thêm nút vào JPanel
        panel.add(button);
        //Thêm JPanel vào 
        frame.add(panel);
        //Hiển thị cửa sổ 
        frame.setVisible(true);
    }
}
