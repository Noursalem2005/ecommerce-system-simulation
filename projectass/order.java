package projectass;

public class order {
    protected int orderid;
    protected int custmorid;
    protected product[] products;
    protected float totalprice;

    public order() {
    }

    public order(int orderid, int custmorid, product[] products, float totalprice) {
        this.orderid = Math.abs(orderid);
        this.custmorid = Math.abs(custmorid);
        this.products = products;
        this.totalprice = Math.abs(totalprice);
    }

    public void print_order_info() {
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer ID: " + custmorid);
        System.out.println("products : ");
        for (int i = 0; i < products.length; i++) { // use products.length instead of nproducts
            System.out.println(products[i].getproductname() + " : " + products[i].getproductprice());
        }
        System.out.println("Total Price: " + totalprice);
    }
}