package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.PlantsDetails;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<PlantsDetails,Long> {


    @Query("SELECT p FROM PlantsDetails p WHERE " +
            "LOWER(p.productName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")

    List<PlantsDetails> searchProducts(@Param("keyword") String keyword);


    List<PlantsDetails> findAllByOrderByDateDesc(Pageable pageable);
}
