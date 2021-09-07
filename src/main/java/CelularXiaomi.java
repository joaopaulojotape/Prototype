public abstract class CelularXiaomi {

    protected double valorVenda;
    protected String tela;

    public abstract CelularXiaomi clonar();
    public abstract String infoCelular();

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }


    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
}