public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;

    public Funcionario(String nome, String sobrenome, float salario){
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalarioAnual(){
        return this.salario * 12;
    }

    public void concederAumento(float valor){
        valor = (valor / 100f) * this.salario;
        this.salario += valor;
    }

}
