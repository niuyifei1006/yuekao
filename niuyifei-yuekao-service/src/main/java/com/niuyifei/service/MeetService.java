package com.niuyifei.service;

import java.util.List;
import java.util.Map;

import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Server;
import com.niuyifei.bean.Type;

public interface MeetService {
	public List<Meet> selAll(Map<String, Object> map);
	public List<Type> selType();
	public List<Server> selServer();
	public void insertMeet(Meet meet);
	public void insertMiddle(Map<String, Object> map);
	public void delMeet(Integer mid);
	public void delMiddle(Integer mid);
	public Meet selMeetById(Integer mid);
	public void updateMeet(Meet meet);
}
