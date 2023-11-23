import java.security.InvalidParameterException;

public abstract class Inmueble {
    private int alquilerMensual;
    private int valorDeAdministracion = 150000;
    protected int estrato;

    public Inmueble(int estrato) {
        this.estrato = checkEstrato(estrato);
        this.alquilerMensual = calculaAlquilerMensual();
    }

    public int getAlquilerMensual() {
        return alquilerMensual;
    }

    public void setAlquilerMensual(int alquilerMensual) {
        this.alquilerMensual = alquilerMensual;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = checkEstrato(estrato);
    }

    public int getValorDeAdministracion() {
        return valorDeAdministracion;
    }

    public void setValorDeAdministracion(int valorDeAdministracion) {
        this.valorDeAdministracion = valorDeAdministracion;
    }

    public int getAlquiler(int meses) {
        return valorDeAdministracion + meses * alquilerMensual;
    }

    private static int checkEstrato(int estrato) {
        if (estrato < 1 || estrato > 6)
            throw new InvalidParameterException("Estrato deberia ser entre 1 y 6");
        return estrato;
    }

    public abstract int calculaAlquilerMensual();

    public abstract int getTipoDeInmueble();

    // TODO: agregar metodo abstracto tostring e implementar para las subclases
}
