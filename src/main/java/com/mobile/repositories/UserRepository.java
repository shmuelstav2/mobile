package com.mobile.repositories;
import com.mobile.domain.Role;
import com.mobile.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    User getDistinctFirstByUsername(String userName );
}

