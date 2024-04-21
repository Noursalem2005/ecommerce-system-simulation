package projectass;

public class cart {
    protected int custmorid;
    protected int nproducts;
    private int index = 0;
    protected product[] products = new product[nproducts];

    public cart() {
    }

    public cart(int custmorid, int nproducts) {
        this.custmorid = Math.abs(custmorid);
        if (nproducts != 0) {
            this.nproducts = Math.abs(nproducts);
        } else {
            System.out
                    .println("you have choosed 0 products so your order will be canceled \nThank U , come again later");
        }
        this.products = new product[nproducts];
    }

    public void setcustmorid(int custmorid) {
        this.custmorid = Math.abs(custmorid);
    }

    public int getcustmorid() {
        return custmorid;
    }

    public void setnproducts(int nproducts) {
        this.nproducts = Math.abs(nproducts);
    }

    public int getnproducts() {
        return nproducts;
    }

    public void setproducts(product[] products) {
        this.products = products;
    }

    public product[] getproducts() {
        return products;
    }

    public void addproduct(product product2) {
        if (index < nproducts) {
            products[index] = product2;
            index++;
        } else {
            System.out.println("you have reached the maximum number of products");
        }
    }

    // iwant the remove function to take string input and remove the product with
    // the same name once not many times
    public void removeproduct(String productname) {
        for (int i = 0; i < nproducts; i++) {
            if (products[i].getproductname().equals(productname)) {
                product[] temp = new product[nproducts - 1];
                for (int j = 0; j < i; j++) {
                    temp[j] = products[j];
                }
                for (int j = i; j < nproducts - 1; j++) {
                    temp[j] = products[j + 1];
                }
                nproducts--;
                products = temp;
                break;
            }
        }
    }

    public float calc_total_price() {
        float total = 0;
        for (int i = 0; i < nproducts; i++) {
            total += products[i].getproductprice();
        }
        return total;
    }

    // place order function
    public void place_order() {
        for (int i = 0; i < nproducts; i++) {
            System.out.println("Product Name: " + products[i].getproductname());
            System.out.println("Product Price: " + products[i].getproductprice());
        }
        System.out.println("Total Price: " + calc_total_price());
    }

}