package ua.com.auc.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfProduct;
    private String nameOfProduct;
    private String modelOfProduct;
    private float priceOfProduct;
    private String descriptionOfProduct;
    @ManyToOne(cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER)
    private SubCategory subCategory;
    @ManyToOne(cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER)
    private Manufacturer manufacturer;

    @ManyToOne(cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER)
    private Client client;

    public Product() {
    }

    public Product(String nameOfProduct, String modelOfProduct, float priceOfProduct, String descriptionOfProduct, SubCategory subCategory, Manufacturer manufacturer, Client client) {
        this.nameOfProduct = nameOfProduct;
        this.modelOfProduct = modelOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.descriptionOfProduct = descriptionOfProduct;
        this.subCategory = subCategory;
        this.manufacturer = manufacturer;
        this.client = client;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getModelOfProduct() {
        return modelOfProduct;
    }

    public void setModelOfProduct(String modelOfProduct) {
        this.modelOfProduct = modelOfProduct;
    }

    public float getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getDescriptionOfProduct() {
        return descriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idOfProduct=" + idOfProduct +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", modelOfProduct='" + modelOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                ", descriptionOfProduct='" + descriptionOfProduct + '\'' +
                ", subCategory=" + subCategory +
                ", manufacturer=" + manufacturer +
                ", client=" + client +
                '}';
    }
}
