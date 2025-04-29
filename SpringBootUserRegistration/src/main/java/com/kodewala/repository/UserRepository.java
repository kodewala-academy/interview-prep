package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>
{

}
