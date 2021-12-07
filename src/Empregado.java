public class Empregado {
    private int idEmpregado;
    private String nome;
    private double salario;

    public Empregado(int idEmpregado,String nome, double salario) {
        this.idEmpregado = idEmpregado;
        this.nome = nome;
        this.salario = salario;

        if (salario<0) {
            this.salario = 0;
        }
    }

    //Construtor
    public Empregado() {
        this.idEmpregado = 0;
        this.nome = "";
        this.salario = 0;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if (salario<0) {
            this.salario = 0;
        }
    }

    //Metods
    public String imprimirEmpregado(int i) {
        return ("ID Empregado: "+(idEmpregado+i) +"\nNome Empregado:" + (nome) + "\nSalário:" + (salario)+"\n");
    }
}
