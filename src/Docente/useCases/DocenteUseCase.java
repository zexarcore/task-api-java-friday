package Docente.useCases;

import java.util.ArrayList;
import java.util.List;

import Docente.models.Docente;

// Contenedor de metodos y atributos
public class DocenteUseCase {

    // Propiedad
    private final List<Docente> docentes; // Definicion Lista en memoria

    // Constructor
    public DocenteUseCase() {
        this.docentes = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String create(String name, String description) {
        try {
            Docente docente = new Docente(user, id, acces, false);
            this.docentes.add(docente); // Uso de la lista
            return "Docente creado:" + Docente.getuser() + " Documento:" + docente.getid();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }
}
