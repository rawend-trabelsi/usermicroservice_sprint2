 package com.rawend.users.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.rawend.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		User findByUsername(String username);

}