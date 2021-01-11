package edu.depauw.csc232.supermarketgeneral;

public class Bottom extends Garment {
   
   
   public Bottom() {
      super();
      this.isBottom = true;
   }
   
   public Bottom(String ItemName, double ItemPrice, int ItemNumber, int QuantitySold, int ItemsInStock, double PercentDiscount, int Size, boolean IsMan) {
      super( ItemName,  ItemPrice,  ItemNumber,  QuantitySold,  ItemsInStock,  PercentDiscount,  Size,  IsMan);
      this.isBottom = true;
   }
   
   public boolean isBottom() {
      return this.isBottom;
   }
   
}
