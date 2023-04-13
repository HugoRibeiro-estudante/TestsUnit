import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTerceirizadoTest {
    @Test
    public void testarConstrutorEntradaDespesasInvalida(){

        assertThrows(IllegalArgumentException.class, ()-> {FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 1000);});
    }

    @Test
    public void testarConstrutorEntradasValidas(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 1000);
        assertEquals("Hugo", terceirizado.getNome());
        assertEquals(120, terceirizado.getHorasTrabalhadas());
        assertEquals(10, terceirizado.getValorHora());
        assertEquals(20, terceirizado.getDespesasAdicionais());
    }

    @Test
    public void testarModificarDespesasEntradaInvalida(){

        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 2000);
        assertThrows(IllegalArgumentException.class, ()-> {terceirizado.setDespesasAdicionais(2000);});

    }

    @Test
    public void testarModificarDespesasEntradavalida(){
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Hugo", 120, 10, 1000);
        assertEquals(10,terceirizado.setDespesasAdicionais(10));
    }


}
