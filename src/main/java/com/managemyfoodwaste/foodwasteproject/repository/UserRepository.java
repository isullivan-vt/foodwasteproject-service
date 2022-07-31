package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Procedure(procedureName = "authenticate_user", outputParameterName = "user_code")
    @Transactional
    Integer authenticateUserProcedureName(String userEmail, String password);
}
