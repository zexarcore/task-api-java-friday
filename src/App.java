
import tasks.models.Task;
import tasks.useCases.TaskUseCase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TaskUseCase taskUseCase = new TaskUseCase();

        // Create

        System.out.println("Se procede a crear las tareas...");
        String create = taskUseCase.create("Leer la documentacion.", "Revisar la guia de conceptos de POO" );
        // System.out.println(create);

        String create2 = taskUseCase.create("Evaluar la documentacion.", "Se procede a evualuar los conceptos aprendidos." );
        // System.out.println(create2);
        System.out.println("\n\n");

        System.out.println("Consultar todas las tareas...");
        // Read
        String read = taskUseCase.all();
        System.out.println(read);
        System.out.println("\n\n");

        System.out.println("Se ha consultado la tarea con el indice 1");
         // Read find by index
        String read2 = taskUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");


        System.out.println("Actualizamos la tarea con indice 0.");
        // Update
        String update = taskUseCase.update(0, "Re-Leer documentacion", "Se ha leido la documentacion varias veces.", true);
        System.out.println(update);

        System.out.println("\n\n");


        System.out.println("Eliminamos la tarea con indice 1.");
        // Delete
        String delete = taskUseCase.delete(1);
        System.out.println(delete);
    }
}