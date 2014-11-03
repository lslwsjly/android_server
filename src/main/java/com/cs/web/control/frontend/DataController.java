package com.cs.web.control.frontend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cs.dao.model.DataTablePO;
import com.cs.facade.DataFacade;
import com.cs.facade.HeaderFacade;
import com.cs.facade.StationFacade;

@RequestMapping("/data")
@Controller
public class DataController {

	@Autowired
	StationFacade stationFacade;
	
	@Autowired
	DataFacade dataFacade;
	
	@Autowired
	HeaderFacade headerFacade;
	
	@RequestMapping("/{page}")
	public final ModelAndView dataPage(final HttpServletRequest request,
			@PathVariable final int page) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("data");
        modelAndView.addObject("header", headerFacade.getHeader(2, request.getSession()));
        HashMap<String, Object> condition = new HashMap<String, Object>();
        condition.put("uid", request.getSession().getAttribute("userId"));
        condition.put("offset", page * 10);
        condition.put("limit", 11);
        modelAndView.addObject("data", dataFacade.getTables(condition));
        return modelAndView;
	}
	
	@RequestMapping("/insert")
	public final ModelAndView insertTable(final HttpServletRequest request, 
			final DataTablePO tablePO) {
		ModelAndView modelAndView = new ModelAndView();
		tablePO.setUid((Integer) request.getSession().getAttribute("userId"));
		dataFacade.insertTable(tablePO);
		modelAndView.setViewName("json");
		return modelAndView;
	}
	
	@RequestMapping("/del/{id}")
	public final ModelAndView deleteTable(final HttpServletRequest request,
			@PathVariable final int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/data/0");
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(id);
		dataFacade.delTable(ids);
		return modelAndView;
	}
	
	@RequestMapping("/update")
	public final ModelAndView updateCol1(final HttpServletRequest request, 
			final DataTablePO tablePO) {
		ModelAndView modelAndView = new ModelAndView();
		dataFacade.updateTable(tablePO);
		modelAndView.setViewName("json");
		return modelAndView;
	}
	
	@RequestMapping(value = "/deal")
    public final ModelAndView dealData(
                final HttpServletRequest request
                , final String file, final int tid) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		modelAndView.addObject("data", dataFacade.loadFromCsv(request.getSession(
                ).getServletContext()
                .getRealPath("/")
                + "WEB-INF/attach/" + file, tid));
		return modelAndView;
    }
	
	@RequestMapping(value = "searchdata")
	public final ModelAndView searchTable(final HttpServletRequest request,
			final String info) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("uid", (Integer) request.getSession().getAttribute("userId"));
		condition.put("info", info);
		condition.put("offset", 0);
		condition.put("limit", 10);
		modelAndView.addObject("data", JSONObject.toJSONString(dataFacade.getTables(condition)));
		return modelAndView;
	}
}
