package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDataRepository extends JpaRepository<UserData,Long> {

    @Query("SELECT c FROM UserData c WHERE c.gmail = :gmail AND c.password = :password ")
    UserData checkValidLogin(@Param("gmail") String gmail,@Param("password") String password);

    @Query("SELECT u FROM UserData u WHERE u.password =:password ")
    UserData findByPasswordCustom(String password);
}
