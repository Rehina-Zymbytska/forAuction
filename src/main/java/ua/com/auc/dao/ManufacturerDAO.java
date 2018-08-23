package ua.com.auc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.auc.entity.Manufacturer;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {
}
