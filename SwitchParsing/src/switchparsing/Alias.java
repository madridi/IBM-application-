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
public class Alias {
    private String nom;
    private ArrayList<String> members;

    public Alias() {
        members=new ArrayList<String>();
    }

    public Alias(String nom) {
        this.nom = nom;
        members=new ArrayList<String>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }
    
    
    
}
