package restaurant.bill;
class healthyburger  extends burger{
    private String addition1;
    private String addition2;
    private double addition1price;
    private double addition2price;
private String rollbread;
private double healthyprice;
private double totalprice;
    public healthyburger() {
    }
    
  public  healthyburger (String rollbread,double totalprice){
      // price of sandwish
super(rollbread, rollbread, totalprice, rollbread);
this.rollbread=rollbread;
this.totalprice=totalprice;
  }

    public String getRollbread() {
        return rollbread;
    }

    public void setRollbread(String rollbread) {
        this.rollbread = rollbread;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

  
 
 public void add1(String w,double e){
     this.addition1price=e;
     this.addition1=w;
     
             
 }
 public void addition1(String w,double t){
     this .addition1=w;
     this .addition1price=t;
 }
    public void addition2(String q,double r)   {
        this .addition2=q;
        this.addition2price=r;
    }  
      public double finalprice() {
       if (this.addition1!=null){
     healthyprice =totalprice+this.addition1price;
         
       }
          if (this.addition2!=null){
              healthyprice=totalprice+this.addition1price+this.addition2price;
          }
         
         return healthyprice;
         }



}