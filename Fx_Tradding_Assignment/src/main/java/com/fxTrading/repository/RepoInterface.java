package com.fxTrading.repository;

import com.fxTrading.entity.Print;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoInterface extends JpaRepository<Print, Integer>{

}
