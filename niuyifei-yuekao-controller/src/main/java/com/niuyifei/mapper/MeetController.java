package com.niuyifei.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Server;
import com.niuyifei.bean.Type;
import com.niuyifei.service.MeetService;

@Controller
public class MeetController {
	
	@Resource
	private MeetService meetService;
	
	@RequestMapping("list")
	public String selAll(Model model,@RequestParam(defaultValue="1")Integer pageNum,
						String mname,String tname,String starttime,String endtime){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mname", mname);
		map.put("tname", tname);
		map.put("starttime", starttime);
		map.put("endtime", endtime);
		PageHelper.startPage(pageNum, 3);
		List<Meet> list = meetService.selAll(map);
		PageInfo<Meet> page = new PageInfo<Meet>(list);
		model.addAttribute("page", page);
		return "list";
	}
	
	@RequestMapping("selType")
	@ResponseBody
	public List<Type> seltype(){
		List<Type> type = meetService.selType();
		return type;
	}

	@RequestMapping("selServer")
	@ResponseBody
	public List<Server> selserver(){
		List<Server> server = meetService.selServer();
		return server;
	}
	
	@RequestMapping("addMeet")
	@ResponseBody
	public boolean insertMeet(Meet meet,String sid){
		try {
			meetService.insertMeet(meet);
			Map<String, Object> map = new HashMap<String, Object>();
			String[] split = sid.split(",");
			for (String string : split) {
				map.put("mid", meet.getMid());
				map.put("sid", string);
				meetService.insertMiddle(map);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	@RequestMapping("delMeet")
	public String delmeet(Integer mid){
		try {
			meetService.delMeet(mid);
			return "redirect:list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:list";
		}
	}
	
	@RequestMapping("selMeetById")
	public String selmeetById(Integer mid,Model model){
		Meet meet = meetService.selMeetById(mid);
		model.addAttribute("meet", meet);
		return "update";
	}
	
	@RequestMapping("updateMeet")
	@ResponseBody
	public boolean updatemeet(Meet meet,String sid){
		try {
			meetService.updateMeet(meet);
			Map<String, Object> map = new HashMap<String, Object>();
			
			meetService.delMiddle(meet.getMid());
			
			String[] split = sid.split(",");
			for (String string : split) {
				map.put("mid", meet.getMid());
				map.put("sid", string);
				meetService.insertMiddle(map);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
