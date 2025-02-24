/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.maven1;

/**
 *
 * @author ivis2
 */
public class Heretic {
    private String name;
    private String crimes;
    private String lastSeen;
    private String id;
    private String level;

    public Heretic(String name, String crimes, String lastSeen, String id, String threatLevel) {
        this.name = name;
        this.crimes = crimes;
        this.lastSeen = lastSeen;
        this.id = id;
        this.level = level;
    }

    public String getName() { 
        return name; 
    }
    public String getCrimes() { 
        return crimes; 
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
}
