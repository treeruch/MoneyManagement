package com.lottery.project.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lottery.project.utility.Mapping;

@Controller
@RestController
@SpringBootApplication
public class RegisterCtrl {
	protected Log logger = LogFactory.getLog(this.getClass());
	
	@RequestMapping(method = RequestMethod.GET, value = Mapping.CONTROLLER.REGISTER)
	 public ModelAndView Register(HttpServletRequest request,HttpSession session) { 
		ModelAndView modelAndView = new ModelAndView(Mapping.PAGE.REGISTER);
		logger.info("Start Register...");
		
		modelAndView.addObject("test","");
		return modelAndView; 
	}
}
