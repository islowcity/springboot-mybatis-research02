package slowcity.com.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import slowcity.com.entity.Orders;
import slowcity.com.entity.OrdersCustom;
import slowcity.com.entity.User;
import slowcity.com.mapper.OrdersCustomMapper;
import slowcity.com.mapper.OrdersCustomerMapper;
import slowcity.com.mapper.UserMapper;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;
    
    @Resource
    private OrdersCustomMapper ordersCustomMapper;

    @Resource
    private OrdersCustomerMapper ordersCustomerMapper;
    
    /*测试resultType 1对1*/
    @GetMapping(value = "/users/orders")
    public List<OrdersCustom> getOrders() {
        return  ordersCustomMapper.findOrdersUser();
    }
    
    /*测试resultMap 1对1*/
    @GetMapping(value = "/users/userOrders")
    public List<OrdersCustom> getUserOrders() {
        return  ordersCustomerMapper.findOrdersCustomer();
    }
    
    /*测试resultMap 1对多*/
    @GetMapping(value = "/users/userAndOrders")
    public List<Orders> getUserAndOrders() {
        return  ordersCustomerMapper.findOrdersAndOrderDetailResultMap();
    }
    
    /*测试resultMap 多对多*/
    @GetMapping(value = "/users/userAndOrdersItems")
    public List<User> getUserAndOrdersAndItems() {
        return  ordersCustomerMapper.findUserAndItemsResultMap();
    }
    
    
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        List<User> users=userMapper.getAll();
        return users;
    }
	/**
	 * 
	 * 注解风格接口测试
	 */
    @GetMapping(value = "/userOne/{id}")
    public User getOneUser(@PathVariable(value = "id") Long id) {
        return userMapper.findOne(id);
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable(value = "id") Long id) {
        return userMapper.getOne(id);
    }

    @PostMapping("/users")
    public void save(@RequestBody User user) {
        userMapper.insert(user);
    }

    @PutMapping("/users")
    public void update(@RequestBody User user) {
        userMapper.update(user);
    }

    @DeleteMapping(value="/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }


}