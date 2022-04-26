package br.com.alura.oobj;

import br.com.alura.oobj.application.ItemPedido;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemPedidoTest {

  ItemPedido ItemPedido = new ItemPedido();{
    ItemPedido.setValorUnitario(new BigDecimal(10));
  }

  @Test
  void getSubtotalCalculandoComUmaUnidade(){
    ItemPedido.setQuantidade(1);

    assertEquals(ItemPedido.getSubtotal(), new BigDecimal(10));
  }

  @Test
  void getSubtotalCalculandoComMaisDeUmaUnidade(){
  ItemPedido.setQuantidade(5);

  assertEquals(ItemPedido.getSubtotal(), new BigDecimal(50));
  }

}

