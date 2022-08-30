package br.com.alura.oobj.application;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class GetTotalExceptionTest {

    Pedido pedidoDois = new Pedido ();

    BigDecimal pedidoDois.getTotal();

    @Test
    void TestarSeListaDeItensNullGeraIllegalExceptionEmGetTotal (){
      return System.out.println(pedidoDois.getTotal());

    }
}
