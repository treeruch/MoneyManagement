package com.lottery.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.project.Repository.SettingRepositoryJPA;
import com.lottery.project.entity.Page;

@Service
public class SettingService {
	
	@Autowired
	private SettingRepositoryJPA settingRepositoryJPA;

	
	public void save(Page page) {
		settingRepositoryJPA.save(page);
	}
}
