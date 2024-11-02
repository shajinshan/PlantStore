package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.AdminData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminData,Long> {

    @Query("select c from AdminData c where c.adminName = :adminName and c.password = :password")
    AdminData findUserByReg(@Param("adminName") String adminName,@Param("password") String password);
}
