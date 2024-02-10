package com.codewithadh.fullstackbackend.repository;

import com.codewithadh.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



}
