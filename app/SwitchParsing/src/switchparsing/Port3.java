/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchparsing;

import java.util.ArrayList;

/**
 *
 * @author DALI
 */
public class Port3 {
     private String num;
    private ArrayList<Float> tx;
    private ArrayList<Float> rx;

    public Port3() {
        tx=new ArrayList<Float>();
        rx=new ArrayList<Float>();
    }

    public Port3(String num) {
        this.num = num;
        tx=new ArrayList<Float>();
        rx=new ArrayList<Float>();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public ArrayList<Float> getTx() {
        return tx;
    }

    public void setTx(ArrayList<Float> tx) {
        this.tx = tx;
    }

    public ArrayList<Float> getRx() {
        return rx;
    }

    public void setRx(ArrayList<Float> rx) {
        this.rx = rx;
    }

}
