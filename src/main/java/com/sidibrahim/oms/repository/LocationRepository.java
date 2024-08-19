package com.sidibrahim.oms.repository;

import com.sidibrahim.oms.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
