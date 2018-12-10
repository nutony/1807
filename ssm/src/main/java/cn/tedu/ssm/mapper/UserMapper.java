package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {
	public List<User> findAll();
	
	//��ѯһ����¼
	@Select("SELECT * FROM USER WHERE id=#{id}")
	public User get(Integer id);
	
	//����
	@Insert("INSERT INTO USER (NAME,birthday,address)"
			+ " VALUES(#{name},#{birthday},#{address})")
	public void add(User user);
	
	//�޸�
	@Update("UPDATE USER SET"
			+ " NAME=#{name},birthday=#{birthday},address=#{address}" 
			+ " WHERE id=#{id}")
	public void update(User user);
	
	//ɾ��һ��
	@Delete("DELETE FROM USER WHERE id=#{id}")
	public void delete(Integer id);
}





