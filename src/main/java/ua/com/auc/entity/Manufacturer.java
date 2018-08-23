package ua.com.auc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfVManufacturer;
    private String nameOfManufacturer;
    @OneToMany(
            cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER,
            mappedBy = "manufacturer")
    private List<Product> productListOfManufacture = new ArrayList<Product>();

    public Manufacturer() {
    }

    public Manufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public Manufacturer(String nameOfManufacturer, List<Product> productListOfManufacture) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.productListOfManufacture = productListOfManufacture;
    }

    public int getIdOfVManufacturer() {
        return idOfVManufacturer;
    }

    public void setIdOfVManufacturer(int idOfVManufacturer) {
        this.idOfVManufacturer = idOfVManufacturer;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public List<Product> getProductListOfManufacture() {
        return productListOfManufacture;
    }

    public void setProductListOfManufacture(List<Product> productListOfManufacture) {
        this.productListOfManufacture = productListOfManufacture;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "idOfVManufacturer=" + idOfVManufacturer +
                ", nameOfManufacturer='" + nameOfManufacturer;

    }
}
