public class Edificio implements ImpactoEcologico {
    private double emisionesConstruccion;
    private double consumoEnergetico;
    private double residuosConstruccion;
    private double eficienciaEnergetica;

    public Edificio(double emisionesConstruccion, double consumoEnergetico, double residuosConstruccion, double eficienciaEnergetica) {
        this.emisionesConstruccion = emisionesConstruccion;
        this.consumoEnergetico = consumoEnergetico;
        this.residuosConstruccion = residuosConstruccion;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesConstruccion + consumoEnergetico + residuosConstruccion - eficienciaEnergetica;
    }
}

