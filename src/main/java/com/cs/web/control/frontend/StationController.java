package com.cs.web.control.frontend;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.dao.model.StationTablePO;
import com.cs.facade.HeaderFacade;
import com.cs.facade.StationFacade;

@RequestMapping("/station")
@Controller
public class StationController {

	@Autowired
	StationFacade stationFacade;
	
	@Autowired
	HeaderFacade headerFacade;
	
	@RequestMapping("/{page}")
	public final ModelAndView dataPage(final HttpServletRequest request,
			@PathVariable final int page) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("station");
        modelAndView.addObject("header", headerFacade.getHeader(1, request.getSession()));
        HashMap<String , Object> condition = new HashMap<String, Object>();
        condition.put("uid", request.getSession().getAttribute("userId"));
        condition.put("offset", page * 10);
        condition.put("limit", 11);
        modelAndView.addObject("data", stationFacade.listStations(condition));
        return modelAndView;
	}
	
	@RequestMapping("/del/{id}")
	public final ModelAndView delStation(final HttpServletRequest request,
			@PathVariable final int id) {
		ModelAndView modelAndView = new ModelAndView();
		stationFacade.delStations(id);
		stationFacade.delStationTable(id);
		modelAndView.setViewName("redirect:/station/0");
		return modelAndView;
	}
	@RequestMapping("/insert")
	public final ModelAndView insertStation(final HttpServletRequest request,
			final StationTablePO spo) {
		ModelAndView modelAndView = new ModelAndView();
		spo.setUid((Integer) request.getSession().getAttribute("userId"));
		stationFacade.insertTable(spo);
		modelAndView.setViewName("redirect:/station/0");
		return modelAndView;
	}
	
	@RequestMapping(value = "/deal")
    public final ModelAndView dealData(
                final HttpServletRequest request
                , final HttpServletResponse response) {
    	response.setContentType("text/html; charset=UTF-8");
    	stationFacade.delStations(Integer.parseInt(request.getParameter("tid")));
    	try {
			PrintWriter out = response.getWriter();
			out.println(stationFacade.loadFromCsv(request.getSession(
                    ).getServletContext()
                    .getRealPath("/")
                    + "WEB-INF/attach/" + request.getParameter("file"), Integer.parseInt(request.getParameter("tid"))));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
	
	@RequestMapping(value = "searchtable")
	public final ModelAndView searchTable(final HttpServletRequest request,
			final String info) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("uid", (Integer) request.getSession().getAttribute("userId"));
		condition.put("info", info);
		condition.put("offset", 0);
		condition.put("limit", 10);
		modelAndView.addObject("data", JSONObject.toJSONString(stationFacade.listStations(condition)));
		return modelAndView;
	}
}
