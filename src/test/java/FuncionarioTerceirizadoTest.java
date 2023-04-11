import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FuncionarioTerceirizadoTest {
    @Test
    public void testarConstrutorEntradaDespesasInvalida(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, -1);

    }

    @Test
    public void testarConstrutorEntradasValidas(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 20);

    }

    @Test
    public void testarModificarDespesasEntradaInvalida(){


    }

    @Test
    public void testarModificarDespesasEntradavalida(){

    }


}
