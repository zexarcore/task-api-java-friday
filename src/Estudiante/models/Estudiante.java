package Estudiante.models;

public class Estudiante {
    private String user;
    private int id;
    private Boolean acces;

    public Estudiante(){}
    
    public Estudiante(String user, int id, Boolean acces){
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

    public void setAcces(Boolean acces){
        this.acces = acces;
    }

    // Getters

    public String getUser(){
        return this.user;
    }

    public int getId(){
        return this.id;
    }

      public Boolean getAcces(){
        return this.acces;
    }
}
