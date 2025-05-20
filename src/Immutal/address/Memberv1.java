package Immutal.address;

public class Memberv1 {

    private String name;
    private  Address address;

    Memberv1(String name, Address address) {
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Memberv1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
