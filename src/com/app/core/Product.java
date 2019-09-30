package com.app.core;

public class Product {
  private String name;
  private Integer price;
  private Category category;
  public Product(String name,Integer price,Integer category)
  {
    this.name=name;
    this.price=price;
    this.category=Category.values()[category];
  }

  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }

  public Category getCategory() {
    return category;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", category=" + category +
        '}';
  }
}
