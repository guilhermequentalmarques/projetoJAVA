public class Comissionado extends Vendedor2{
    private double percComissao;
    public Comissionado(int cpf, String nome, double vendas, int salarioBase, double percComissao) {
        super(cpf, nome, vendas, salarioBase);
        this.percComissao = percComissao;
    }
    public double getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }
    @Override
    public String toString() {
        return "Comissionado{" +
                "percComissao=" + percComissao +
                '}';
    }
    public double calcularSalario() {
        double salario = getSalarioBase() + (this.percComissao/100 * getSalarioBase());
        return salario;
    }
}
