
public class MemoriaEstatica {
    
    private int [] memoria;
    private int contador;

    public MemoriaEstatica (int tama){
        memoria = new int [tama];
        contador = 0; 
    }

    // Agregar elemento
    public boolean agregar (int valor){
        if (contador < memoria.length){
            memoria[contador++] = valor;
            return true;
        }
        return false; // memoria llena  
    }

    // Eliminar último elemento
    public boolean eliminar () {
        if (contador > 0) {
            contador--;
            memoria[contador] = 0; // opcional limpiar el valor
            return true;
        }
        return false; // memoria vacía
    }

    // Mostrar contenido
    public void mostrar (){
        System.out.print("[");
        for (int i = 0; i < contador; i++) {
            System.out.print(memoria[i]); 
            if (i < contador - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Buscar valor y devolver índice o -1
    public int buscar (int valor ) {
        for (int i = 0; i < contador; i++) {
            if (memoria[i] == valor) { 
                return i; 
            }
        }
        return -1; 
    }

    // Main para pruebas
    public static void main(String[] args) {
        MemoriaEstatica memoria = new MemoriaEstatica(5);
        memoria.agregar(10);
        memoria.agregar(20);
        memoria.agregar(30);
        memoria.mostrar(); //[10, 20, 30]

        System.out.println("Índice de 20: " + memoria.buscar(20)); 
        System.out.println("Índice de 40: " + memoria.buscar(40)); 
        
        memoria.eliminar();
        memoria.mostrar(); //[10, 20]
    }
}