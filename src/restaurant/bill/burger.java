 
package restaurant.bill;

public class burger {
    private String typeofmeat;
    private String typeofbread;
    private double price;
    private String name;
       private String add1;
    private double add1price;
    private String add2;
    private double add2price;
    private  String add3;
    private double add3price ;
    private String add4;
    private double add4price;
    private double totalprice;
public burger (){
    
}
    public burger(String typeofmeat, String typeofbread, double price, String name) {
        this.typeofmeat = typeofmeat;
        this.typeofbread = typeofbread;
        this.price = price;
        this.name = name;
    }

    public String getTypeofmeat() {
        return typeofmeat;
    }

    public String getTypeofbread() {
        return typeofbread;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setTypeofmeat(String typeofmeat) {
        this.typeofmeat = typeofmeat;
    }

    public void setTypeofbread(String typeofbread) {
        this.typeofbread = typeofbread;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
   public void addition1(String sortofaddition,double pri){
       this.add1=sortofaddition;
       this.add1price=pri;
    
}
   public void addition2(String c,double x){
       this.add2=c;
       this.add2price=x;
   }
   public void addition3(String r,double d){
       this.add3=r;
       this.add3price=d;

   }
   public void addition(String s,double l){
       this.add4=s;
       this.add4price=l;

   }
  // String z="yes";
  double  finalprice(){
      if (add1!=null){
          totalprice=price+add1price;
      }
       if (add2!=null){
          totalprice=add1price+price+add2price;
      }
        if (add3!=null){
          totalprice=price+add1price+add2price+add3price;
      }
         if (add4!=null){
          totalprice=price+add1price+add2price+add3price+add4price;
      }
      return totalprice;
    
  
    
}
}