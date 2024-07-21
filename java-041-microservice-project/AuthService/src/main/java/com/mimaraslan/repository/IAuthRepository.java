package com.mimaraslan.repository;

import com.mimaraslan.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
public interface IAuthRepository extends JpaRepository <Auth, Long> {

    Boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    Optional <Auth> findByUsernameAndPassword(String username, String password);
}
