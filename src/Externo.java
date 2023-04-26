public class Externo extends Vendedor2{
    private double percComissao;
    private double adcional;
    public Externo(int cpf, String nome, double vendas, int salarioBase, double percComissao, double adcional) {
        super(cpf, nome, vendas, salarioBase);
        this.percComissao = percComissao;
        this.adcional = adcional;
    }
    public double getPercComissao() {
        return percComissao;
    }
    public double getAdcional() {
        return adcional;
    }
    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }
    public void setAdcional(double adcional) {
        this.adcional = adcional;
    }
    @Override
    public String toString() {
        return "Externo{" +
                "percComissao=" + percComissao +
                ", adcional=" + adcional +
                '}';
    }
    public double calcularSalario(){
        double salario = getSalarioBase() + this.adcional;
        return salario;
    }
}
