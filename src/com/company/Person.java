public class Person {
    private String fname;
    private String lname;
    private String address;

     Person(String fname, String lname, String address) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public String getName() {
        return fname;
    }
    public void setName(String name) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return fname +" " + lname + " " +  address;
    }
}
