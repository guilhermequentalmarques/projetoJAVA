public class Vendedor {
    private int cpf;
    private String nome;
    private double vendas;
    private double salarioBase;

    public Vendedor(int cpf, String nome, double vendas, int salarioBase) {
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
    public double calcularSalario(){
        double salario = getSalarioBase();
        return salario;
    }
    public double calcularSalario(int desconto){
        double salario = salarioBase - desconto/100;
        return salario;
    }
    public double calcularSalario(int desconto, int comissao){
        double salario =  (salarioBase - desconto/100) + (salarioBase/comissao);
        return salario;
    }

    public String toString(){
        return cpf + " " + nome + " " + vendas + " " + salarioBase;
    }
}
