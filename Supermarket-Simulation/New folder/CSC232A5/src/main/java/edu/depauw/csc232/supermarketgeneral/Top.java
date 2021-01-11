package edu.depauw.csc232.supermarketgeneral;

public class Top extends Garment{
   
   
   public Top() {
      super();
      this.isTop = true;
   }
   
   public Top(String ItemName, double ItemPrice, int ItemNumber, int QuantitySold, int ItemsInStock, double PercentDiscount, int Size, boolean IsMan) {
      super( ItemName,  ItemPrice,  ItemNumber,  QuantitySold,  ItemsInStock,  PercentDiscount,  Size,  IsMan);
      this.isTop = true;
   }

   public static void displayInfo()
   {
      System.out.println("Apple price: $2/kg");
   }
   

}
