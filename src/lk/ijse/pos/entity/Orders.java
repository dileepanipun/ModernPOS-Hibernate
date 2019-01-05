package lk.ijse.pos.entity;

public class Orders {

    private String orderID;
    private String date;
    private String custID;

    public Orders() {
    }

    public Orders(String orderID, String date, String custID) {
        this.orderID = orderID;
        this.date = date;
        this.custID = custID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }
}
