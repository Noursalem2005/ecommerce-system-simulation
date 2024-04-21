package projectass;

public class custmer {
    protected int custmerid;
    protected String name;
    protected String address;

    public custmer() {
    }

    public custmer(int custmerid, String name, String address) {
        this.custmerid = Math.abs(custmerid);
        this.name = name;
        this.address = address;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setcustmerid(int custmerid) {
        this.custmerid = Math.abs(custmerid);
    }

    public int getcustmerid() {
        return custmerid;
    }
}