package com.app.core;

import java.util.LinkedList;
import java.util.List;

public class Cart {
  private List<Item> listOfItems;

  public Cart() {
    listOfItems = new LinkedList<>();
  }

  public List<Item> getCart() {
    return listOfItems;
  }

  public void addItems(Item item) {
    listOfItems.add(item);
  }

}
