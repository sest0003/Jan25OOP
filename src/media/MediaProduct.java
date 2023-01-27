package media;

public abstract class MediaProduct {

    protected int price;
    protected int productId;

    public void printDetails() {
        System.out.println();
        System.out.println();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
