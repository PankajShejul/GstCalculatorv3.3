package com.app.core;

public enum Category {
  FOOD(0.0),FURNITURE(0.05),ELECTRONICS(0.10);
  private Double value;
  Category(Double value)
  {
    this.value=value;
  }
  public Double getGstRate()
  {
    return value;
  }
}
