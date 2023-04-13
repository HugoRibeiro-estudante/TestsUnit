public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);
    }

    public double calcularPagamento(){

        double salario = (this.horasTrabalhadas*this.valorHora);

        if(salario < 1320) {
            throw new IllegalArgumentException("O valor do pagamento dos funcionários deve ser maior ou igual ao valor atual do salário mínimo que corresponde a R$ 1320.00.");
        }
            return salario;

        }


    public int validaHorasTrabalhadas( int horas){
        if(horas > 40){
            throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
        }
        return horas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {

        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public void setValorHora(double valor) {
        this.valorHora = validaValorHora(valor);
    }

    public double validaValorHora(double valor){
        if(valor < 58.2 || valor > 132 ){
            throw new IllegalArgumentException("O valor por hora precisa ser entre 4% e 10% do salário mínimo.");
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }
}
