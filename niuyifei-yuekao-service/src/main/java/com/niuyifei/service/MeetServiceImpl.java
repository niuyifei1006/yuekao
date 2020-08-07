package com.niuyifei.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Server;
import com.niuyifei.bean.Type;
import com.niuyifei.mapper.MeetMapper;
@Service
public class MeetServiceImpl implements MeetService {
	
	@Resource
	private MeetMapper meetMapper;
	
	public List<Meet> selAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return meetMapper.selAll(map);
	}

	public List<Type> selType() {
		// TODO Auto-generated method stub
		return meetMapper.selType();
	}

	public List<Server> selServer() {
		// TODO Auto-generated method stub
		return meetMapper.selServer();
	}

	public void insertMeet(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.insertMeet(meet);
	}

	public void insertMiddle(Map<String, Object> map) {
		// TODO Auto-generated method stub
		meetMapper.insertMiddle(map);
	}

	public void delMeet(Integer mid) {
		// TODO Auto-generated method stub
		meetMapper.delMeet(mid);
	}

	public void delMiddle(Integer mid) {
		// TODO Auto-generated method stub
		meetMapper.delMiddle(mid);
	}

	public Meet selMeetById(Integer mid) {
		// TODO Auto-generated method stub
		return meetMapper.selMeetById(mid);
	}

	public void updateMeet(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.updateMeet(meet);
	}

}
