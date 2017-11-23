public class Funcionario {
    private String nome;
    private int cpf;
    private float salario;

    public Funcionario(String nome, int cpf, float salario){
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;
}
    public int getCPF(){
        return this.cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float num){
        this.salario=num;
    }
}