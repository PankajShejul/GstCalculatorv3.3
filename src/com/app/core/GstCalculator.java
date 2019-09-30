package com.app.core;

public class GstCalculator {
  private Cart cart;
  public GstCalculator(Cart cart)
  {
    this.cart=cart;
  }

  public Double calculateGst(Integer totalPrice,Category category)
  {
      return totalPrice*category.getGstRate();
  }
  public void dispalyBill()
  {
    Double totalPrice=0.0,totalGst=0.0,gst;
    Integer price;
    for(Category category:Category.values())
    {
      cart.getCart().stream().filter(p->p.getProduct().getCategory()==category).forEach(System.out::println);
      price=cart.getCart().stream().filter(p->p.getProduct().getCategory()==category).mapToInt(p->p.getQuantity()*p.getProduct().getPrice()).sum();
      gst=calculateGst(price,category);
      System.out.println("Gst price:"+gst);
      System.out.println("Price for"+category+":"+(price+gst));
      totalPrice+=price;
      totalGst+=gst;
    }
    System.out.println("Total Gst:"+totalGst);
    System.out.println("Total Price including Gst:"+(totalPrice+totalGst));
  }

}
