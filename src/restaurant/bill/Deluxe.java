package restaurant.bill;
class Deluxe extends burger{
           private String addition1;
    private String addition2;
    private double addition1price;
    private double addition2price;
    private String typeofmeat;
    private double deluxeburger;
          private double totalprice;
           public Deluxe() {
    }

    public Deluxe(String typeofmeat, String typeofbread, double price, String name) {
        super(typeofmeat, typeofbread, price, name);
    }

    public String getTypeofmeat() {
        return typeofmeat;
    }

    public void setTypeofmeat(String typeofmeat) {
        this.typeofmeat = typeofmeat;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
    
    void addit1(String f,double g){
        this.addition1=f;
        this.addition1price=g;
    }
    void additi2(String s,double a){
        this.addition2=s;
        this.addition2price=a;
    }
    public double finalprice() {
        if (this.addition1!=null){
            deluxeburger=totalprice+this.addition1price;
        }
        if(this.addition2!=null){
            deluxeburger=totalprice+this.addition1price+this.addition2price;
        }
        return deluxeburger;
    }}
