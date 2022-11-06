package com.lottery.project.Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lottery.project.utility.Mapping;
import com.lottery.project.entity.Page;
import com.lottery.project.service.SettingService;

@Controller
public class SettingCtrl {
	
	@Autowired
	private SettingService settingService;

	@GetMapping(Mapping.GET.GET_MAP_PAGE_ADD)
	 public ModelAndView pageAdd(HttpServletRequest request,HttpSession session) { 
		ModelAndView modelAndView = new ModelAndView(Mapping.PAGE.PAGE_ADD);
	
		return modelAndView; 
	}
	
	@GetMapping(Mapping.GET.GET_MAP_SETTING)
	 public ModelAndView setting(HttpServletRequest request,HttpSession session) { 
		ModelAndView modelAndView = new ModelAndView(Mapping.PAGE.SETTING);
	
		return modelAndView; 
	}
	
	@RequestMapping(value = Mapping.POST.POST_MAP_INSERT_PAGE ,method = {RequestMethod.POST})
	public ModelAndView insertPage(Page page, HttpSession session) throws Exception{
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName(Mapping.PAGE.PAGE_ADD);
		page.setStatus(1);
		page.setCreateDate(new Date());
		settingService.save(page);
		return modelview; // view
	}
}
