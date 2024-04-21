package projectass;

import projectass.product;

public class clothingproduct extends product {
    protected String size;
    protected String fabric;

    public clothingproduct() {
    }

    public clothingproduct(int productid, String productname, float productprice, String size, String fabric) {
        super(productid, productname, productprice);
        this.size = size;
        this.fabric = fabric;
    }

    public void setsize(String size) {
        this.size = size;
    }

    public String getsize() {
        return size;
    }

    public void setfabric(String fabric) {
        this.fabric = fabric;
    }

    public String getfabric() {
        return fabric;
    }
}
