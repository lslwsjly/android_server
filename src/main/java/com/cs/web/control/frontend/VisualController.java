package com.cs.web.control.frontend;

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

@RequestMapping("/visual")
@Controller
public class VisualController {

	@Autowired
	private HeaderFacade headerFacade;
	@Autowired
	private StationFacade stationFacade;
	
	@Autowired
	private DataFacade dataFacade;
	@RequestMapping("/select")
	public final ModelAndView selectData(final HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("visual");
		modelAndView.addObject("header", headerFacade.getHeader(3, request.getSession()));
		
		return modelAndView;
	}
	
	@RequestMapping("/searchstation")
	public final ModelAndView searchStation(final HttpServletRequest request,
			final int tid, final double minlat, final double maxlat, final double minlng, final double maxlng) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("tid", tid);
		condition.put("minlat", minlat);
		condition.put("maxlat", maxlat);
		condition.put("minlng", minlng);
		condition.put("maxlng", maxlng);
		modelAndView.addObject("data", JSONObject.toJSONString(stationFacade.searchStations(condition)));
		return modelAndView;
	}
	
	@RequestMapping("/searchdata")
	public final ModelAndView searchData(final HttpServletRequest request,
			final int did, final double minlat, final double maxlat, final double minlng, final double maxlng,
			final int type, final String cols, final double rad, final int pace, final int start) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("table", "table" + did);
		condition.put("minlat", minlat);
		condition.put("maxlat", maxlat);
		condition.put("minlng", minlng);
		condition.put("maxlng", maxlng);
		condition.put("type", type);
		condition.put("cols", cols);
		condition.put("rad", rad);
		condition.put("pace", pace);
		condition.put("start", start);
		modelAndView.addObject("data", JSONObject.toJSONString(dataFacade.searchData(condition)));
		return modelAndView;
	}
	
	@RequestMapping("/getdata")
	public final ModelAndView getData(final HttpServletRequest request,
			final int did, final double lat, final double lng) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		
		condition.put("table", "table" + did);
		condition.put("lat", lat);
		condition.put("lng", lng);
		modelAndView.addObject("data", JSONObject.toJSONString(dataFacade.getData(condition)));
		return modelAndView;
	}
	
	@RequestMapping("/map/{tid}/{did}")
	public final ModelAndView mapView(final HttpServletRequest request,
			@PathVariable final int tid, @PathVariable final int did) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("map0");
		modelAndView.addObject("tid", tid);
		modelAndView.addObject("did", did);
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("id", did);
		condition.put("offset", 0);
		condition.put("limit", 1);
		List<HashMap<String, Object>> ans = (List<HashMap<String, Object>>) dataFacade.getTables(condition).get("list"); 
		modelAndView.addObject("datainfo", ans.get(0));
		return modelAndView;
	}
	
	@RequestMapping("/areasearch")
	public final ModelAndView areaSearch(final HttpServletRequest request,
			final int did, final double minlat, final double maxlat, final double minlng, final double maxlng, final int count, final int pace) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("json");
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("table", "table" + did);
		condition.put("minlat", minlat);
		condition.put("maxlat", maxlat);
		condition.put("minlng", minlng);
		condition.put("maxlng", maxlng);
		condition.put("count", count);
		condition.put("pace", pace);
		modelAndView.addObject("data", JSONObject.toJSONString(dataFacade.areaSearch(condition)));
		return modelAndView;
	}
}
