import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {

    @Test
    public void testarConstrutorPagamentoInvalido(){

        Funcionario func = new Funcionario("Hugo", 40, 10);

        assertThrows(IllegalArgumentException.class, ()-> {func.calcularPagamento();});


    }

    @Test
    public void testarConstrutorEntradaValorHoraInvalida(){

        Funcionario func = new Funcionario("Hugo", 40, 10);

        assertThrows(IllegalArgumentException.class, ()-> {func.getvalorHora();});

    }

    @Test
    public void testarConstrutorEntradaHorasInvalida(){

        Funcionario func = new Funcionario("Hugo", 41, 10);


        assertThrows(IllegalArgumentException.class, ()-> {func.getHorasTrabalhadas();});

    }

    @Test
    public void TestarConstrutorEntradasValida(){

        Funcionario func = new Funcionario("Hugo", 40, 14);

        assertEquals("Hugo", func.getNome());
        assertEquals(40, func.getHorasTrabalhadas());
        assertEquals(14, func.getValorHora());

    }

    @Test
    public void testarModificarHorasEntradaInvalido(){

        Funcionario func = new Funcionario("Hugo", 40, 14);
        assertThrows(IllegalArgumentException.class, ()-> {func.setHorasTrabalhadas(42);});
    }

    @Test
    public void testarModificarHorasEntradavalida(){
        Funcionario func = new Funcionario("Hugo", 40, 14);
        assertThrows(30, ()-> {func.setHorasTrabalhadas(30);});
    }


    @Test
    public void testarModificarValorPagamentoInvalido(){

        Funcionario func = new Funcionario("Hugo", 40, 14);
        assertEquals(560, func.calculaPagamento());
    }


    @Test
    public void testarModificarValorEntradaInvalida(){

        Funcionario func = new Funcionario("Hugo", 41, 10);
        assertThrows(IllegalArgumentException.class, ()-> {func.setValorHora(1);});
    }

    @Test
    public void testarModificarValorEntradaValida(){

        Funcionario func = new Funcionario("Hugo", 41, 10);
        assertEquals(15, func.setValorHora());

    }

}
