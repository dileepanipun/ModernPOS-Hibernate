package lk.ijse.pos.entity;

public class CustomEntitiy {

    private String orderID;
    private String orderDate;
    private String customerName;
    private String customerAddress;

    private String code;
    private String descrioption;
    private int qty;

    public CustomEntitiy() {
    }

    public CustomEntitiy(String orderID, String orderDate, String customerName, String customerAddress) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public CustomEntitiy(String code, String descrioption, int qty) {
        this.code = code;
        this.descrioption = descrioption;
        this.qty = qty;
    }

    public CustomEntitiy(String orderID, String orderDate, String customerName, String customerAddress, String code, String descrioption, int qty) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.code = code;
        this.descrioption = descrioption;
        this.qty = qty;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescrioption() {
        return descrioption;
    }

    public void setDescrioption(String descrioption) {
        this.descrioption = descrioption;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
