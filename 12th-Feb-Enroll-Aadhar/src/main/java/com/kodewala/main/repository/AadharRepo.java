package com.kodewala.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.main.entity.UserInfo;

@Repository
public interface AadharRepo extends JpaRepository<UserInfo, Long>
{

}
