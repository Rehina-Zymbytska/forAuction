package ua.com.auc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.auc.dao.CommonCategoryDAO;
import ua.com.auc.entity.CommonCategory;

import java.util.List;
import java.util.Map;

@RestController
public class CommonCategoryRestController {

    @Autowired
    CommonCategoryDAO commonCategoryDAO;

    @GetMapping("/api/commonCategory")
    List<CommonCategory> findAll() {
        return commonCategoryDAO.findAll();
    }

    @GetMapping("/api/commonCategory/{id}")
    CommonCategory findById(@PathVariable int id) {
        return commonCategoryDAO.findOne(id);
    }

    @PostMapping("/api/commomCategory")
    CommonCategory commonCategory(@RequestParam String nameOfCommonCategory) {
        CommonCategory commonCategory = new CommonCategory(nameOfCommonCategory);
        return commonCategoryDAO.save(commonCategory);
    }

    @PutMapping("/api/commonCategory{id}")
    CommonCategory update(@PathVariable int id, @RequestParam String nameOfCommonCategory) {
        CommonCategory commonCategory = commonCategoryDAO.findOne(id);

        if (nameOfCommonCategory != null) {

            commonCategory.setNameOfCommonCategory(nameOfCommonCategory);
        }
        return commonCategoryDAO.save(commonCategory);
    }

    @DeleteMapping("/api/commonCategory/{id}")
    boolean delete(@PathVariable int id){
        commonCategoryDAO.delete(id);
        return true;
    }



}
