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
public class Area {
    private String name;
    private ArrayList<Member> members;
    private String statut="repos";

    public Area(String name) {
        this.name = name;
         members =new ArrayList<Member>();
    }
 public Area() {
       members =new ArrayList<Member>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    
    
}
