/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public abstract class Hinhhoc {
    private int dai;
    private int rong;
    public abstract double tinhchuvi();
    public abstract double tinhdientich();
    public Hinhhoc(int dai, int rong){
        super();
        this.dai = dai;
        this.rong = rong;
    }
    public Hinhhoc(){
        super();
    }
    public int getdai(){
        return dai;
    }
    public void setdai(int dai){
        this.dai = dai;
    }
    public int getrong(){
        return rong;
    }
    public void setrong(int rong){
        this.rong = rong;
    }
}
