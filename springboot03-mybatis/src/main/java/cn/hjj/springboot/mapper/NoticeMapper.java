package cn.hjj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.hjj.springboot.po.Notice;

@Mapper
public interface NoticeMapper {
    
	@Select("select * from notice")
	public List<Notice> findAll();
	
	public Long count();
	
	public List<Notice> findByPage(@Param("p")Integer page, 
			                       @Param("r")Integer rows);
}


