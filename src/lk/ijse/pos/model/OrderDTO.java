package lk.ijse.pos.model;

import java.util.ArrayList;

public class OrderDTO {

    private String id;
    private String date;
    private String customerID;
    private ArrayList<OrderDetailDTO> itemDetailsList;

    public OrderDTO() {
    }

    public OrderDTO(String id, String date, String customerID, ArrayList<OrderDetailDTO> itemDetailsList) {
        this.id = id;
        this.date = date;
        this.customerID = customerID;
        this.itemDetailsList = itemDetailsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public ArrayList<OrderDetailDTO> getItemDetailsList() {
        return itemDetailsList;
    }

    public void setItemDetailsList(ArrayList<OrderDetailDTO> itemDetailsList) {
        this.itemDetailsList = itemDetailsList;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", customerID='" + customerID + '\'' +
                ", itemDetailsList=" + itemDetailsList +
                '}';
    }
}
