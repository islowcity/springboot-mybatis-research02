package slowcity.com.entity;
import java.util.Date;
import java.util.List;
 
public class User {
    private Integer id;
    // 姓名
    private String userName;
    // 性别
    private String sex;
    // 地址
    private String address;
    // 生日
    private Date birthday;
    // 用户创建的订单列表
    private List<Orders> ordersList;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<Orders> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", sex=" + sex
				+ ", address=" + address + ", birthday=" + birthday
				+ ", ordersList=" + ordersList + "]";
	}
     
}