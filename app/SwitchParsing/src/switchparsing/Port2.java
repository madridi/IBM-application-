/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchparsing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DALI
 */
public class Port2 {
    private String num;
    private ArrayList<String> tx;
    private ArrayList<String> rx;

    public Port2() {
        tx=new ArrayList<String>();
        rx=new ArrayList<String>();
    }

    public Port2(String num) {
        this.num = num;
        tx=new ArrayList<String>();
        rx=new ArrayList<String>();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<String> getTx() {
        return tx;
    }

    public void setTx(ArrayList<String> tx) {
        this.tx = tx;
    }

    public ArrayList<String> getRx() {
        return rx;
    }

    public void setRx(ArrayList<String> rx) {
        this.rx = rx;
    }

   
    
    
}
