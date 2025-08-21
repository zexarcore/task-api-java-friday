package Docente.models;

public class Docente {
    private String user;
    private int id;
    private Boolean acces;

    public Docente(){}
    
    public Docente(String user, int id, boolean acces){
        this.user = user;
        this.id = id;
    }

    // Setters
    public void setName(String user){
        this.user = user;
    }

    public void setid(int id){
        this.id = id;
    }
    public void setName(boolean acces){
        this.acces = acces;
    }
    // Getters
    public String getUser(){
        return this.user;
    }

    public int getid(){
        return this.id;
    }
    public boolean  getacces(){
        return this.acces;
    }
}

