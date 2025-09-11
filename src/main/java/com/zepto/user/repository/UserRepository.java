package com.zepto.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zepto.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<Long,UserEntity>{

	Optional<UserEntity> findByUserId(String userId);

}
