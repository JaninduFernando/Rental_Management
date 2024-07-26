package edu.icet.demo.repository;

import edu.icet.demo.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HardwareItemRepository extends CrudRepository<HardwareItemEntity ,Integer> {

}
