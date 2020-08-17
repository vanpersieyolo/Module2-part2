package Excercise1;

import java.io.Serializable;

public class Product implements Serializable {
    int productCode;
    String namePr;
    String brandPr;
    int price;

    public Product() {
    }

    public Product(int productCode, String namePr, String brandPr, int price) {
        this.productCode = productCode;
        this.namePr = namePr;
        this.brandPr = brandPr;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getNamePr() {
        return namePr;
    }

    public void setNamePr(String namePr) {
        this.namePr = namePr;
    }

    public String getBrandPr() {
        return brandPr;
    }

    public void setBrandPr(String brandPr) {
        this.brandPr = brandPr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", namePr='" + namePr + '\'' +
                ", brandPr='" + brandPr + '\'' +
                ", price=" + price +
                '}';
    }
}
