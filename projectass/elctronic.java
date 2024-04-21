package projectass;

import projectass.product;

public class elctronic extends product {
    protected String brand;
    protected int wrantlyperiod;

    public elctronic() {
    }

    public elctronic(int productid, String productname, float productprice, String brand, int wrantlyperiod) {
        super(productid, productname, productprice);
        this.brand = brand;
        this.wrantlyperiod = Math.abs(wrantlyperiod);
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setwrantlyperiod(int wrantlyperiod) {
        this.wrantlyperiod = Math.abs(wrantlyperiod);
    }

    public int getwrantlyperiod() {
        return wrantlyperiod;
    }

}
