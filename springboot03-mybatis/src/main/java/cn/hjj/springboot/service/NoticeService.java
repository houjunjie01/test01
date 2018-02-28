package cn.hjj.springboot.service;

import java.util.List;
import java.util.Map;

import cn.hjj.springboot.po.Notice;

public interface NoticeService {
    public List<Notice> findAll();
    
    public Map<String, Object> findByPage(Integer page, Integer rows);
}
