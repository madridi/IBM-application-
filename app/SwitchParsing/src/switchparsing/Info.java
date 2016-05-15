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
public class Info {
    private String nom;
    private ArrayList<String> detail;

    public Info(String nom, ArrayList<String> detail) {
        this.nom = nom;
        this.detail = detail;
    }

    public Info() {
        detail=new ArrayList<String>();
    }

    public Info(String nom) {
        this.nom = nom;
        detail=new ArrayList<String>();
    }

    public String getNom() {
        return nom;
        
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getDetail() {
        return detail;
    }

    public void setDetail(ArrayList<String> detail) {
        this.detail = detail;
    }
    
    
}
