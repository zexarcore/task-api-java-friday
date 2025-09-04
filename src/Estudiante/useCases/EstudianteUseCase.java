package Estudiante.useCases;

import java.util.ArrayList;
import java.util.List;

import Estudiante.models.Estudiante;

// Contenedor de metodos y atributos
public class EstudianteUseCase {

    // Propiedad
    private final List<Estudiante> estudiantes; // Definicion Lista en memoria

    // Constructor
    public EstudianteUseCase() {
        this.estudiantes = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String create(String name, String description) {
        try {
            Estudiante estudiante = new Estudiante (tipoCliente, email, recuperarPassword, registrarse false);
            this.estudiantes.add(estudiante); // Uso de la lista
            return "Estudiante creado:" + Estudiante.getuser() + " Documento:" + Estudiante.getid();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

 // UPDATE
    public String update(int index, String name, String description) {
        try {
            Estudiante estudiante = new Estudiante (user, id, acces, false);
            this.estudiantes.add(estudiante); // Uso de la lista
            return "Estudiante creado:" + Estudiante.getuser() + " Documento:" + Estudiante.getid();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

}

