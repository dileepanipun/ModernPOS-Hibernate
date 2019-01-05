package lk.ijse.pos.entity;

public class OrderDetail {

    private OrderDetail_PK orderDetail_pk;
    private int qty;
    private double unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetail_PK orderDetail_pk, int qty, double unitPrice) {
        this.orderDetail_pk = orderDetail_pk;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
