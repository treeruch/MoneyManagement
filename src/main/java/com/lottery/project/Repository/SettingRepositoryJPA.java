package com.lottery.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lottery.project.entity.Page;

@Repository
public interface SettingRepositoryJPA extends JpaRepository<Page, Long>  {

}
