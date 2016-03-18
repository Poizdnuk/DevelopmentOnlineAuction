package com.auction.repository;

import com.auction.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRoleRepository")
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
