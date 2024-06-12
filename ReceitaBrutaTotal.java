public class ReceitaBrutaTotal extends Calculo {
    private float receitaBrutaTotal;
    public ReceitaBrutaTotal() {
        this.receitaBrutaTotal = 0;
    }
    public float obtResultado(float[] _valReceitaBruta) {
        for (float val : _valReceitaBruta) {
            this.receitaBrutaTotal += val;
        }
        resultado = this.receitaBrutaTotal;
        return resultado;
    }
}