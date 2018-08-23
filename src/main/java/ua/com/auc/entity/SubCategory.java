package ua.com.auc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfSubCategory;
    private String nameOfSubCategory;
    @ManyToOne(cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER)
    private CommonCategory commonCategory;
    @OneToMany(
            cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER,
            mappedBy = "subCategory")
    private List<Product> productList = new ArrayList<Product>();

    public SubCategory() {
    }

    public SubCategory(String nameOfSubCategory) {
        this.nameOfSubCategory = nameOfSubCategory;
    }

    public SubCategory(String nameOfSubCategory, CommonCategory commonCategory) {
        this.nameOfSubCategory = nameOfSubCategory;
        this.commonCategory = commonCategory;
    }

    public SubCategory(String nameOfSubCategory, CommonCategory commonCategory, List<Product> productList) {
        this.nameOfSubCategory = nameOfSubCategory;
        this.commonCategory = commonCategory;
        this.productList = productList;
    }

    public int getIdOfSubCategory() {
        return idOfSubCategory;
    }

    public void setIdOfSubCategory(int idOfSubCategory) {
        this.idOfSubCategory = idOfSubCategory;
    }

    public String getNameOfSubCategory() {
        return nameOfSubCategory;
    }

    public void setNameOfSubCategory(String nameOfSubCategory) {
        this.nameOfSubCategory = nameOfSubCategory;
    }

    public CommonCategory getCommonCategory() {
        return commonCategory;
    }

    public void setCommonCategory(CommonCategory commonCategory) {
        this.commonCategory = commonCategory;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "idOfSubCategory=" + idOfSubCategory +
                ", nameOfSubCategory='" + nameOfSubCategory + '\'' +
                ", commonCategory=" + commonCategory +
                ", productList=" + productList;
    }
}
