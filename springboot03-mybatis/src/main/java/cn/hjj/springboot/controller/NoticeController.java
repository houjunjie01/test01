package cn.hjj.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.hjj.springboot.po.Notice;
import cn.hjj.springboot.service.NoticeService;

@Controller
public class NoticeController {
    @Autowired
	private NoticeService noticeService;
	
    @GetMapping("/findNotices")
    @ResponseBody
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
    
    @GetMapping("/toNotice")
    public String toNotice() {
    	return "/html/notice.html";
    }
    
    @PostMapping("/findByPage")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer rows) {
    	return noticeService.findByPage((page - 1) * rows, rows);
    }
}
