package ua.com.auc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.auc.entity.CommonCategory;

public interface CommonCategoryDAO extends JpaRepository<CommonCategory, Integer> {
}
