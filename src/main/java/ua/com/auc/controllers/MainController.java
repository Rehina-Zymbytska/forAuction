package ua.com.auc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.auc.dao.CommonCategoryDAO;
import ua.com.auc.dao.ManufacturerDAO;
import ua.com.auc.entity.CommonCategory;
import ua.com.auc.entity.Manufacturer;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ManufacturerDAO manufacturerDAO;

    @Autowired
    private CommonCategoryDAO commonCategoryDAO;

    @GetMapping("/")
    public String commonCategory(Model model) {
        List<CommonCategory> commonCategoryList = commonCategoryDAO.findAll();
        model.addAttribute("commonCategoryList", commonCategoryList);
        return "home";

    }

    @PostMapping("/save")
    public String commonCategoryCreate(@RequestParam String nameOfCommonCategory) {
       CommonCategory commonCategory = new CommonCategory(nameOfCommonCategory);
        commonCategoryDAO.save(commonCategory);
        return "home";
    }
}
