package dao;
public class Admin {
    String name;
    String designation;
    String password;
    int mobile;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPassword() {
        return password;
    }

    public int getMobile() {
        return mobile;
    }
}