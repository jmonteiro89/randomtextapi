package com.betvictor.app.ws;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.betvictor.app.bsl.TaskManager;
import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResponse;

@Controller
public class WebServiceImpl {

	private final static Logger logger = LoggerFactory.getLogger(WebServiceImpl.class.getName());

	@Autowired
	private TaskManager taskManager;

	@RequestMapping(value = "/text", method = RequestMethod.GET)
	public @ResponseBody TaskResponse getDamage(@RequestParam(value = "p_start", required = true) Integer p_start,
			@RequestParam(value = "p_end", required = true) Integer p_end,
			@RequestParam(value = "w_count_min", required = true) Integer w_count_min,
			@RequestParam(value = "w_count_max", required = true) Integer w_count_max, 
			HttpServletRequest request, HttpServletResponse response) {
		logger.debug("Requested Text");
		
		TaskRequest requestCreated = new TaskRequest(p_start, p_end, w_count_min, w_count_max);
		
		return taskManager.doTask(requestCreated);

	}
	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public ModelAndView getHistory(){
		ModelAndView model = new ModelAndView("history");
		model.addObject("list", taskManager.getTaskHistory());
		return model;
	}
}
