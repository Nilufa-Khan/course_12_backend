package org.example.domain;

public class Product {
    private int productId;
    private  String productName;
    private  String productColor;

    public Product(int productId, String productName, String productColor) {
        this.productId = productId;
        this.productName = productName;
        this.productColor = productColor;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {

        return "Product{" +
                "ProductId=" + productId +
                ", ProductName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                '}';
    }
}
