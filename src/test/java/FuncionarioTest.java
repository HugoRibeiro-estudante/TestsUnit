import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {

    @Test
    public void testarConstrutorPagamentoInvalido(){

        Funcionario func = new Funcionario("Hugo", 2, 100);

        assertThrows(IllegalArgumentException.class, ()-> {func.calcularPagamento();});

    //AJUSTAR
    }

    @Test
    public void testarConstrutorEntradaValorHoraInvalida(){

        Funcionario func = new Funcionario("Hugo", 40, 1);

        assertThrows(IllegalArgumentException.class, ()-> {func.getValorHora();});
    //AJUSTAR
    }

    @Test
    public void testarConstrutorEntradaHorasInvalida(){

        Funcionario func = new Funcionario("Hugo", 41, 100);


        assertThrows(IllegalArgumentException.class, ()-> {func.getHorasTrabalhadas();});

    }

    @Test
    public void TestarConstrutorEntradasValida(){

        Funcionario func = new Funcionario("Hugo", 40, 100);

        assertEquals("Hugo", func.getNome());
        assertEquals(40, func.getHorasTrabalhadas());
        assertEquals(100, func.getValorHora());

    }

    @Test
    public void testarModificarHorasEntradaInvalido(){

        Funcionario func = new Funcionario("Hugo", 40, 100);
        func.setHorasTrabalhadas(42);
        assertEquals(42, func.getHorasTrabalhadas());
    }

    @Test
    public void testarModificarHorasEntradavalida(){
        Funcionario func = new Funcionario("Hugo", 40, 100);
        func.setHorasTrabalhadas(30);
        assertEquals(30, func.getHorasTrabalhadas());
    }


    @Test
    public void testarModificarValorPagamentoInvalido(){

        Funcionario func = new Funcionario("Hugo", 4, 100);
        assertEquals(560, func.calcularPagamento());
    }


    @Test
    public void testarModificarValorEntradaInvalida(){

        Funcionario func = new Funcionario("Hugo", 41, 100);
        assertThrows(IllegalArgumentException.class, ()-> {func.setValorHora(1);});
    }

    @Test
    public void testarModificarValorEntradaValida(){

        Funcionario func = new Funcionario("Hugo", 40, 101);
        func.setValorHora(100);
        assertEquals(100, func.getValorHora());

    }

}
