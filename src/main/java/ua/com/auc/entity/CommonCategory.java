package ua.com.auc.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CommonCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfCommonCategory;
    private String nameOfCommonCategory;
    @OneToMany(
            cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER,
            mappedBy = "commonCategory")
    private List<SubCategory> subCategoryList = new ArrayList<SubCategory>();

    public CommonCategory() {
    }

    public CommonCategory(String nameOfCommonCategory) {
        this.nameOfCommonCategory = nameOfCommonCategory;
    }

    public CommonCategory(String nameOfCommonCategory, List<SubCategory> subCategoryList) {
        this.nameOfCommonCategory = nameOfCommonCategory;
        this.subCategoryList = subCategoryList;
    }

    public int getIdOfCommonCategory() {
        return idOfCommonCategory;
    }

    public void setIdOfCommonCategory(int idOfCommonCategory) {
        this.idOfCommonCategory = idOfCommonCategory;
    }

    public String getNameOfCommonCategory() {
        return nameOfCommonCategory;
    }

    public void setNameOfCommonCategory(String nameOfCommonCategory) {
        this.nameOfCommonCategory = nameOfCommonCategory;
    }

    public List<SubCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<SubCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }

    @Override
    public String toString() {
        return "CommonCategory{" +
                "idOfCommonCategory=" + idOfCommonCategory +
                ", nameOfCommonCategory='" + nameOfCommonCategory;
    }
}
