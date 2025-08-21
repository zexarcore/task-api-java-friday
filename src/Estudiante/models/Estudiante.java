package Estudiante.models;

public class Estudiante {
    private String user;
    private int id;
    private String acces;

    public Estudiante(){}
    
    public Estudiante(String user, int id, String acces){
        this.user = user;
        this.id = id;
        this.acces = acces;
    }

    // Setters
    public void setUser(String user){
        this.user = user;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAcces(String acces){
        this.acces = acces;
    }

    // Getters

    public String getUser(){
        return this.user;
    }

    public int getId(){
        return this.id;
    }

      public String getAcces(){
        return this.acces;
    }
}
