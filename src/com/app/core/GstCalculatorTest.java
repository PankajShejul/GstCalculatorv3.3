package com.app.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GstCalculatorTest {

  Product burger, chair, mobile,pizza,table,radio;
  Item burgers, chairs, mobiles,pizzas,tables,radioes;
  Cart cart;
  GstCalculator cal;

  @Before
  public void setUp() throws Exception {
    burger=new Product("Burger",80,0);
    chair=new Product("chairs",200,1);
    mobile=new Product("Mobile",500,2);
    pizza=new Product("Pizza",100,0);
    table=new Product("Table",300,1);
    radio=new Product("Radio",200,2);
    burgers=new Item(burger,10);
    chairs=new Item(chair,10);
    mobiles=new Item(mobile,5);
    pizzas=new Item(pizza,5);
    tables=new Item(table,5);
    radioes=new Item(radio,10);
    cart=new Cart();
    cart.addItems(burgers);
    cart.addItems(mobiles);
    cart.addItems(chairs);
    cart.addItems(pizzas);
    cart.addItems(tables);
    cart.addItems(radioes);
    cal=new GstCalculator(cart);
  }

  @Test
  public void dispalyBill() {
    cal.dispalyBill();
  }
}