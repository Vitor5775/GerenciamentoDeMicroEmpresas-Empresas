public class TipoEmpresa {
  private String tipo;
  public TipoEmpresa(String tipo) {
      this.tipo = tipo;
  }
  public String getTipo() {
      return tipo;
  }
  public void setTipo(String tipo) {
      this.tipo = tipo;
  }
  @Override
  public String toString() {
      return "Tipo de Empresa: " + tipo;
  }
}