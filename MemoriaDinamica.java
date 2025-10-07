import java.util.ArrayList;

public class MemoriaDinamica {
    ArrayList<Integer> memoria = new ArrayList<>();
    int contador;

    public MemoriaDinamica(){
        contador = 0;
    }
    
    // Agrega un elemento 
    public void agregar(int valor){
        memoria.add(valor);
        contador++;
    }

    // Elimina el último elemento 
    public boolean eliminar(){
        if (contador > 0){
            memoria.remove(--contador);
            return true;
        }
        return false; // si está vacía
    }
}