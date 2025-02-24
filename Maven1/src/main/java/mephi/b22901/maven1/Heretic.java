/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.maven1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivis2
 */
public class Heretic {
    static ArrayList<Heretic> Heretics = new ArrayList<>();
    private String name;
    private List<String> crimes;
    private String lastSeen;
    private String id;
    private String level;

    public Heretic(String name, List<String> crimes, String lastSeen, String id, String level) {
        this.name = name;
        this.crimes = crimes;
        this.lastSeen = lastSeen;
        this.id = id;
        this.level = level;
    }

    public String getName() { 
        return name; 
    }
    public  List<String> getCrimes() { 
        return crimes; 
    }
    public  String getCrime(int a) { 
        return crimes.get(a); 
    }
    public String getLastSeen() { 
        return lastSeen; 
    }
    public String getId() { 
        return id; 
    }
    public String getLevel() { 
        return level; 
    }

    @Override
    public String toString() {
        return name + " (" + level + ")";
    }
    
    public static void addHeretic(Heretic heretic){
        Heretics.add(heretic);
    }
}
