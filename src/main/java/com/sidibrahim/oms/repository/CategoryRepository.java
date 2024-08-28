package com.sidibrahim.oms.repository;

import com.sidibrahim.oms.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
