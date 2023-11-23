public class Apartamento extends Inmueble {
    public Apartamento(int estrato) {
        super(estrato);
    }

    @Override
    public int calculaAlquilerMensual() {
        return 1500000 + (estrato / 4) * 1000000 + (estrato / 6) * 1500000;
    }

    @Override
    public int getTipoDeInmueble() {
        return 1;
    }
}
