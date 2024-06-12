public abstract class Calculo {
    public float resultado;
    public Calculo() {
        this.resultado = 0;
    }
    public abstract float obtResultado(float[] _valReceitaBruta);
    public float getValResultado() {
        return resultado;
    }
    public void setValResultado(float resultado) {
        this.resultado = resultado;
    }
}
