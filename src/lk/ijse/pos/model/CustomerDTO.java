package lk.ijse.pos.model;

public class CustomerDTO {
    private String customerID;
    private String custName;
    private String address;
    private String telephoneNO;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID, String custName, String address, String telephoneNO) {
        this.customerID = customerID;
        this.custName = custName;
        this.address = address;
        this.telephoneNO = telephoneNO;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNO() {
        return telephoneNO;
    }

    public void setTelephoneNO(String telephoneNO) {
        this.telephoneNO = telephoneNO;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerID='" + customerID + '\'' +
                ", custName='" + custName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNO='" + telephoneNO + '\'' +
                '}';
    }
}
