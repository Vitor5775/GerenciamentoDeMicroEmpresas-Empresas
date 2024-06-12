public abstract class Perfil {
    public double determinado;
    public Perfil() {
        this.determinado = 0;
    }
    public abstract double obtDeterminado(int perfil, float receitaBrutaTotal);
    public double getValResultado() {
        return determinado;
    }
    public void setValResultado(float resultado) {
        this.determinado = resultado;
    }
}