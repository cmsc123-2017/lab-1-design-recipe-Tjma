class Item{
 double discount;
 double price;
 
 final int LIMIT_PRICE = 1000;
 
 Item(double discount, double price){
   this.discount = discount;
   this.price = price;
 }
 // Make a function that returns the sale price of an item
 // Note that the sale is only applicable to those items that exceed 1000

 // -> double
 // Returns the discounted price of the item
 double totalPrice(){
   return price - (price * discount);
 }  
 
 // -> double
 // Apply the discount to the price of an item if it exceeds 1000, given the
 // item price and discount percentage. 
 // Return the price if the item does not exceeds 1000
 
 double salePrice1000(){
   if(LIMIT_PRICE < price) {
     return totalPrice();
   } else {
     return price;
   }
 }

}
  