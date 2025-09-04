package Estudiante.models;

public class Estudiante {
    private String tipoCliente;
    private int email;
    private Boolean password;
    private String recuperarPassword;
    private String registrarse;


    public Estudiante(){}
    
    public Estudiante(String tipoCliente, int email, Boolean password, String recuperarPassword,String registrarse){
        this.tipoCliente = tipoCliente;
        this.email = email;
        this.password = password;
        this.recuperarPassword = recuperarPassword;
        this. registrarse = registrarse;

    }

    // Setters
    public void settipoCliente(String tipocliente){
        this.tipoCliente = tipocliente;
    }

    public void setemail(int email){
        this.email = email;
    }

    public void setpassword(Boolean password){
        this.password = password;
    }
    public void setrecuperarPassword(String recuperarPasword){
        this.recuperarPassword = recuperarPasword;
    }
     public void setregistrarse(String registrarse){
        this.registrarse = registrarse;
    }


    // Getters

    public String gettipoCliente(){
        return this.tipoCliente;
    }

    public int getemail(){
        return this.email;
    }

    public Boolean getpassword(){
        return this.password;
    }

     public String getrecuperarPassword(){
        return this.recuperarPassword;
    }

    public String getgistrarse(){
        return this.registrarse;
    }

}
