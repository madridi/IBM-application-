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
public class Port {
  private String num;
    private ArrayList<Info> info;

    public Port(String num) {
        this.num = num;
        info =new ArrayList<Info>();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public ArrayList<Info> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Info> info) {
        this.info = info;
    }
    
}
