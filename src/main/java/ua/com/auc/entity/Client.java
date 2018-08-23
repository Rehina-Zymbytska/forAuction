package ua.com.auc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfClient;
    private String nameOfClient;
    private String surNameOfClient;
    @OneToMany(
            cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER,
            mappedBy = "client")
    private List<Product> productListOfClient = new ArrayList<Product>();

    public Client() {
    }

    public Client(String nameOfClient, String surNameOfClient) {
        this.nameOfClient = nameOfClient;
        this.surNameOfClient = surNameOfClient;
    }

    public Client(String nameOfClient, String surNameOfClient, List<Product> productListOfClient) {
        this.nameOfClient = nameOfClient;
        this.surNameOfClient = surNameOfClient;
        this.productListOfClient = productListOfClient;
    }

    public int getIdOfClient() {
        return idOfClient;
    }

    public void setIdOfClient(int idOfClient) {
        this.idOfClient = idOfClient;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public String getSurNameOfClient() {
        return surNameOfClient;
    }

    public void setSurNameOfClient(String surNameOfClient) {
        this.surNameOfClient = surNameOfClient;
    }

    public List<Product> getProductListOfClient() {
        return productListOfClient;
    }

    public void setProductListOfClient(List<Product> productListOfClient) {
        this.productListOfClient = productListOfClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idOfClient=" + idOfClient +
                ", nameOfClient='" + nameOfClient + '\'' +
                ", surNameOfClient='" + surNameOfClient + ", productListOfClient=" + productListOfClient;
    }
}
