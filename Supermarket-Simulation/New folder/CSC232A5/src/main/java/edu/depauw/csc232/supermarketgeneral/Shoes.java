package edu.depauw.csc232.supermarketgeneral;

public class Shoes extends Garment{
   
   public Shoes() {
      super();
      this.isShoes = true;
   }
   
   public Shoes(String ItemName, double ItemPrice, int ItemNumber, int QuantitySold, int ItemsInStock, double PercentDiscount, int Size, boolean IsMan) {
      super( ItemName,  ItemPrice,  ItemNumber,  QuantitySold,  ItemsInStock,  PercentDiscount,  Size,  IsMan);
      this.isShoes = true;
   }

   public static void displayInfo() {
      // TODO Auto-generated method stub
      
   }
}
