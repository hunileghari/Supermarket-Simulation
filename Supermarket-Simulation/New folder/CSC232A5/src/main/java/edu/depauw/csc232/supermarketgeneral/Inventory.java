package edu.depauw.csc232.supermarketgeneral;

public class Inventory {
   public Inventory(SupermarketItem apples,SupermarketItem oranges,SupermarketItem tops,SupermarketItem shoes ) {
	   
          storage[0]=apples;
		  storage[1]=oranges;
		  storage[2]=tops;
		  storage[3]=shoes;
		       
         }      
         
         

   private SupermarketItem [] storage = new SuptermarketItem[4];
   
   public void display(String itemName, int numberofitems)
   {
      
      for(int i=0; i<numberofitems; i++)
      {
         
          System.out.println("The number of" + itemName " : "+storage[i].getnum());
      }
      
   }
   
   public void stock(String itemName, int numbertoStock) {
      for(int i = 0;i < numbertoStock; i++) { 
      storage[itemNametonumber(itemName)][i]=true;}
      
   }
      
      public int itemNametonumber(String item)
      {
         if(item=="apple")
         {
            return 0;
         }
         else if(item=="orange")
         {
            return 1;
         }
         else if(item=="shoe")
         {
            return 2;
         }
         else
         {
            return 3;
         }
         
      }
      
      int numberofapple;
      int numberoforanges;

      public String numitems(String item) {
         // TODO Auto-generated method stub
         return null;
      }
      
      public int stringitemtonum(String item) {
    	  if(item.equals("apple"))
    	  {
    		  return 0;
    	  }
    	  if(item.equals("orange"))
    	  {
    		  return 1 ;
    	  }
    	  if(item.equals("top"))
    	  {
    		  return 2 ;
    	  
      }
    	  if(item.equals("shoes"))
    	  {
    		  return 3 ;
    	  
}
   
   
   
   
   
   
   
   


