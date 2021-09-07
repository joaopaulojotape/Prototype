public class CelularModelo3535 extends CelularXiaomi {

    protected CelularModelo3535(CelularModelo3535 cel) {
        this.tela = "7 polegadas";
        this.valorVenda = cel.getValorVenda();
    }

    public CelularModelo3535() {

    }


    public String infoCelular() {

        return "O Celular possui tela " + this.tela + " e custa " + getValorVenda();

    }

    public CelularXiaomi clonar() {

        return new CelularModelo3535(this);
    }


}