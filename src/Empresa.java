import java.util.ArrayList;
import  java.util.List;

public class Empresa {
    private static List<Inmueble> listaDeInmuebles = new ArrayList<>();

    public static void main(String[] args) {
        // Crear inmuebles
        agregarObjecto(new Apartamento(5));
        agregarObjecto(new Apartamento(6));

        // Mostrar datos de cada inmueble
        mostrarDatos();

        // Mostrar el promedio
        System.out.println(String.format("Promedio: %.2f", calculaPromedio()));
    }

    private static void agregarObjecto(Inmueble inmueble) {
        listaDeInmuebles.add(inmueble);
    }

    private static void mostrarDatos() {
        for (Inmueble inmueble : listaDeInmuebles) {
            switch (inmueble.getTipoDeInmueble()) {
                case 1:
                    System.out.printf("Apartamento con alquiler mensual $%d\n", inmueble.getAlquilerMensual());
                    break;
                case 2:
                    System.out.printf("Casa con alquiler mensual $%d\n", inmueble.getAlquilerMensual());
                    break;
                default:
                    System.out.println("Sin detalles");
            }
        }
    }

    private static double calculaPromedio() {
        double promedio = 0;
        for (Inmueble inmueble : listaDeInmuebles) {
            promedio += inmueble.getAlquilerMensual();
        }
        return promedio / listaDeInmuebles.size();
    }
}
