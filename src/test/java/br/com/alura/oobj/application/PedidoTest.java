package br.com.alura.oobj.application;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PedidoTest {

    ItemPedido Item1 = new ItemPedido();
    public Pedido pedidoUm = new Pedido();{
       Item1.setValorUnitario(BigDecimal.valueOf(20));
       pedidoUm.setItens((List) Item1);
    }

    @Test
    void TestarTotalPedidoComApenasUmItem() {
        Item1.setQuantidade(1);
        assertEquals(pedidoUm.getTotal(), BigDecimal.valueOf(20));
        }

     @Test
     void TestarTotalComMultiplosItnes(){
         ItemPedido Item2 = new ItemPedido();
         Item2.setValorUnitario(BigDecimal.valueOf(30));
         Item1.setQuantidade(2);
         Item2.setQuantidade(3);
         pedidoUm.getItens().add(Item2);
         assertEquals(pedidoUm.getTotal(), BigDecimal.valueOf(130));

     }
}
