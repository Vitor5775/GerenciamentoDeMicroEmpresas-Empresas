public class Estacao {
    ReceitaBrutaTotal rbt = new ReceitaBrutaTotal();
    AliquotaEfetiva ae = new AliquotaEfetiva();
    private float[] valReceitaBruta = new float[12];
    private float valReceitaBrutaTotal;
    private double valAliquotaEfetiva;

    // Construtores
    public Estacao(float[] valReceitaBruta, float valReceitaBrutaTotal, float valAliquotaEfetiva) {
        this.valReceitaBruta = valReceitaBruta;
        this.valReceitaBrutaTotal = valReceitaBrutaTotal;
        this.valAliquotaEfetiva = valAliquotaEfetiva;
    }
    public Estacao(float[] valReceitaBruta, float valRBTouAE) {
        this.valReceitaBruta = valReceitaBruta;
        this.valReceitaBrutaTotal = 0;
        this.valAliquotaEfetiva = 0;
    }
    public Estacao(float valReceitaBrutaTotal, float valAliquotaEfetiva) {
        this.valReceitaBrutaTotal = valReceitaBrutaTotal;
        this.valAliquotaEfetiva = valAliquotaEfetiva;
    }
    public Estacao(float[] valReceitaBruta) {
        this.valReceitaBruta = valReceitaBruta;
    }
    public Estacao(float valRBTouAE) {
        this.valReceitaBrutaTotal = 0;
        this.valAliquotaEfetiva = 0;
    }
    public void defReceitaBrutaTotal(float[] _valReceitaBruta) {
        valReceitaBrutaTotal = rbt.obtResultado(_valReceitaBruta);
    }
    public void defAliquotaEfetiva(int perfil, float receitaBrutaTotal) {
        valAliquotaEfetiva = ae.obtDeterminado(perfil, valReceitaBrutaTotal);
    }
    public float getValReceitaBrutaTotal() {
        return valReceitaBrutaTotal;
    }
    public void setValReceitaBrutaTotal(float valReceitaBrutaTotal) {
        this.valReceitaBrutaTotal = valReceitaBrutaTotal;
    }
    public double getValAliquotaEfetiva() {
        return valAliquotaEfetiva;
    }
    public void setValAliquotaEfetiva(double valAliquotaEfetiva) {
        this.valAliquotaEfetiva = valAliquotaEfetiva;
    }
    public float[] getValReceitaBruta() {
        return valReceitaBruta;
    }
    public void setValReceitaBruta(float[] valReceitaBruta) {
        this.valReceitaBruta = valReceitaBruta;
    }
}