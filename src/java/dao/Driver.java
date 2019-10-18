package dao;
public class Driver {
    String name;
    String address;
    String driverlicense;
    String mobile;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDriverlicense(String driverlicense) {
        this.driverlicense = driverlicense;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDriverlicense() {
        return driverlicense;
    }

    public String getMobile() {
        return mobile;
    }
}