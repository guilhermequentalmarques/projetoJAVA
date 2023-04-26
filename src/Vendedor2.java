public class Vendedor2 {
    private int cpf;
    private String nome;
    private double vendas;
    private double salarioBase;

    public Vendedor2(int cpf, String nome, double vendas, int salarioBase) {
        this.cpf = cpf;
        this.nome = nome;
        this.vendas = vendas;
        this.salarioBase = salarioBase;
    }


    public int getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getVendas() {
        return vendas;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString(){
        return cpf + " " + nome + " " + vendas + " " + salarioBase;
    }
    public double calcularSalario(){
        double salario = getSalarioBase();
        return salario;
    }
    public void aumentarSalarioBase(){
        this.salarioBase = this.salarioBase + vendas/100 * this.salarioBase;
    }
}
