package Docente.models;

public class Docente {
    private String user;
    private int id;

    public Docente(){}
    
    public Docente(String user, int id){
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
    // Getters
    public String getUser(){
        return this.user;
    }

    public int getid(){
        return this.id;
    }
}

