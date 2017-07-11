package Collections;

import java.util.*;

public class HashSetRemoveDuplicates {
 
    public static void main(String a[]){
         
        HashSet lhm = new HashSet();
        lhm.add(new Price("Banana", 20));
        lhm.add(new Price("Apple", 40));
        lhm.add(new Price("Orange", 30));

        Iterator itr = lhm.iterator();
        
        for(;itr.hasNext();)
        {
        	System.out.println(itr.next());
        }
        
        Price duplicate = new Price("Banana", 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        Iterator itr1 = lhm.iterator();
        for(;itr1.hasNext();)
        {
        	System.out.println(itr1.next());
        }
    }
}
 
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
    
   public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}
