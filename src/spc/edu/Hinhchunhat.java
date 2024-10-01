/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Hinhchunhat extends Hinhhoc{
   
    public Hinhchunhat(){
        super();
        // TODO Auto-generated consstructor stub
    }
    public Hinhchunhat(int dai, int rong){
        super(dai, rong);
        // TODO Auto-generated consstructor stub
    }
    public double tinhchuvi() {
        return(this.getdai() + this.getrong()) * 2;
    }
    public double tinhdientich() {
        return this.getdai() * this.getrong();
    }
}
