 package slowcity.com.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import slowcity.com.entity.User;

@Service
@Transactional
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
    
    /* 
     * 基于注解风格的mybatis mapper
     */
    
    @Select("select * from users where id=#{id}")
    User findOne(Long id);
    
    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into users(userName, sex) values(#{userName}, #{sex})")
    public int add(User user);
       
    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from users where id=#{id}")
    public int deleteById(Long id);
         
    //使用@Update注解指明update方法要执行的SQL
    @Update("update users set userName=#{userName},sex=#{sex} where id=#{id}")
    public int updateUser(User user);
}	