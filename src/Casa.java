import java.security.InvalidParameterException;

public class Casa extends Inmueble {
    private int numeroDePlantillas;

    public Casa(int estrato, int numeroDePlantillas) {
        super(estrato);
        this.numeroDePlantillas = checkNumeroDePlantillas(numeroDePlantillas);

        // Aunque calculaAlquilerMensual() se llame en el constructor de Inmueble,
        // Tiene que ser llamado otra vez porque tiene que ser llamado despues de inicializar numeroDePlantillas
        super.setAlquilerMensual(calculaAlquilerMensual());
    }

    @Override
    public int calculaAlquilerMensual() {
        return 5000000 + (numeroDePlantillas - 1) * 1000000;
    }

    private static int checkNumeroDePlantillas(int numeroDePlantillas) {
        if (numeroDePlantillas < 1)
            throw new InvalidParameterException("Casa deberia tener al menos una plantilla");
        return numeroDePlantillas;
    }

    @Override
    public int getTipoDeInmueble() {
        return 2;
    }
}
