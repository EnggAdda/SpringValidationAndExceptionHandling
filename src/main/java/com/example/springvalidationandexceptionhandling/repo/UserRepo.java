package com.example.springvalidationandexceptionhandling.repo;

import com.example.springvalidationandexceptionhandling.entity.User;
import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmParentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
