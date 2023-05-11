package LAB3TH;
public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return this.quantity * this.product.getPrice();
    }

    public Product getProduct() {
        return this.product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
}