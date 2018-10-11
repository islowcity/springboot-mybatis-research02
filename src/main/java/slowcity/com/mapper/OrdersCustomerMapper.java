package slowcity.com.mapper;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import slowcity.com.entity.Orders;
import slowcity.com.entity.OrdersCustom;
import slowcity.com.entity.User;

@Service
@Transactional
public interface OrdersCustomerMapper {
    /** 查询订单 一对一，关联查询用户信息 */
    public List<OrdersCustom> findOrdersCustomer();
    
    /** 查询订单 一对多关联查询用户信息，使用reslutMap实现*/
    public List<Orders> findOrdersAndOrderDetailResultMap();
    
    /** 查询订单多对多关联查询用户信息，使用reslutMap实现*/
    public List<User> findUserAndItemsResultMap();
}