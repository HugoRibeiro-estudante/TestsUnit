import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTerceirizadoTest {
    @Test
    public void testarConstrutorEntradaDespesasInvalida(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 2000);
        assertEquals("Hugo", terceirizado.getNome());
        assertEquals(40, terceirizado.getHorasTrabalhadas());
        assertEquals(100, terceirizado.getValorHora());
        assertEquals(2000, terceirizado.getDespesasAdicionais());
    }

    @Test
    public void testarConstrutorEntradasValidas(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 40, 100, 1000);
        assertEquals("Hugo", terceirizado.getNome());
        assertEquals(40, terceirizado.getHorasTrabalhadas());
        assertEquals(100, terceirizado.getValorHora());
        assertEquals(1000, terceirizado.getDespesasAdicionais());
    }

    @Test
    public void testarModificarDespesasEntradaInvalida(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 40, 100, 2000);
        assertThrows(IllegalArgumentException.class, ()-> {terceirizado.setDespesasAdicionais(2000);});

    }

    @Test
    public void testarModificarDespesasEntradavalida(){
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 40, 100, 1000);
        terceirizado.setDespesasAdicionais(10);
        assertEquals(10,terceirizado.getDespesasAdicionais());
    }


}
