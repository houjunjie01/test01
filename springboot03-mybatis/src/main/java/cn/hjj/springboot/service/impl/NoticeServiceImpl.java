package cn.hjj.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hjj.springboot.mapper.NoticeMapper;
import cn.hjj.springboot.po.Notice;
import cn.hjj.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		// TODO Auto-generated method stub
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<>();
		
		Long count = noticeMapper.count();
		List<Notice> list = noticeMapper.findByPage(page, rows);
		
		result.put("total", count);
		result.put("rows", list);
		
		return result;
		
	}
}
