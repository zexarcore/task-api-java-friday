package Estudiante.models;

public class Task {
    private String user;
    private int id;

    public Task(){}
    
    public Task(String user, int id){
        this.user = user;
        this.id = id;
    }

    // Setters
    public void setUser(String user){
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
