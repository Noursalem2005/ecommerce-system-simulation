package projectass;

public class product {
    protected int productid;
    protected String productname;
    protected float productprice;

    public product() {
    }

    public product(int productid, String productname, float productprice) {
        this.productname = productname;
        this.productid = Math.abs(productid);
        this.productprice = Math.abs(productprice);
    }

    public void setproductname(String productname) {
        this.productname = productname;
    }

    public String getproductname() {
        return productname;
    }

    public void setproductprice(float productprice) {
        this.productprice = Math.abs(productprice);
    }

    public float getproductprice() {
        return productprice;
    }

    public void setproductid(int productid) {
        this.productid = Math.abs(productid);
    }

    public int getproductid() {
        return productid;
    }
}
