// Definición de la clase Empanada
class Empanada {
    // Atributos
    private String sabor;
    private double precio;
    private boolean estaCaliente;

    // Constructor
    public Empanada(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
        this.estaCaliente = false;
    }

    // Método para calentar la empanada
    public void calentar() {
        estaCaliente = true;
        System.out.println("La empanada de " + sabor + " está caliente ahora.");
    }

    // Método para enfriar la empanada
    public void enfriar() {
        estaCaliente = false;
        System.out.println("La empanada de " + sabor + " se ha enfriado.");
    }

    // Método para mostrar información sobre la empanada
    public void mostrarInformacion() {
        System.out.println("Empanada de " + sabor);
        System.out.println("Precio: $" + precio);
        if (estaCaliente) {
            System.out.println("Estado: Caliente");
        } else {
            System.out.println("Estado: Fría");
        }
    }
}

// Clase principal
public class Empanadas {
    public static void main(String[] args) {
        // Crear objetos de la clase Empanada
        Empanada empanada1 = new Empanada("Carne", 2.5);
        Empanada empanada2 = new Empanada("Pollo", 2.0);

        // Llamar a métodos de la clase Empanada
        empanada1.mostrarInformacion();
        empanada1.calentar();
        empanada1.mostrarInformacion();
        empanada1.enfriar();
        empanada1.mostrarInformacion();

        System.out.println(); // Separador

        empanada2.mostrarInformacion();
        empanada2.calentar();
        empanada2.mostrarInformacion();
    }
}
