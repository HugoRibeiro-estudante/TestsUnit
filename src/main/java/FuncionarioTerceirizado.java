public class FuncionarioTerceirizado extends Funcionario{

    private double despesasAdicionais;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = validaDespesas(despesasAdicionais);
    }

    public double calcularPagamento(){

        double salario = (super.getHorasTrabalhadas()*super.getValorHora()+this.despesasAdicionais*1.1);

        if(salario > 1320)
            throw new IllegalArgumentException("O valor do pagamento dos funcionários deve ser maior ou igual ao valor atual do salário mínimo,\n" +
                    "que corresponde a R$ 1320.00.");
        return salario;

    }

    public double validaDespesas(double desp){
        if(desp > 1000){
            throw new IllegalArgumentException("O valor das despesas adicionais não pode ultrapassar R$ 1000.00.");
        }
        return desp;
    }

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double desp) {
        this.despesasAdicionais = validaDespesas(desp);
    }
}
