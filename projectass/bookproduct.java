package projectass;

public class bookproduct extends product {
    protected String author;
    protected String publisher;

    public bookproduct() {
    }

    public bookproduct(int productid, String productname, float productprice, String author, String publisher) {
        super(productid, productname, productprice);
        this.author = author;
        this.publisher = publisher;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getauthor() {
        return author;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getpublisher() {
        return publisher;
    }

}
