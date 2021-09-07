public class CelularModelo2525 extends CelularXiaomi {

    protected CelularModelo2525(CelularModelo2525 tv) {
        this.tela = "7,5 polegadas";
        this.valorVenda = tv.getValorVenda();
    }


    public CelularModelo2525() {

    }

    public String infoCelular() {

       return "O celular possui tela " + this.tela + " e custa " + getValorVenda();

    }

    public CelularXiaomi clonar() {

        return new CelularModelo2525(this);
    }

}