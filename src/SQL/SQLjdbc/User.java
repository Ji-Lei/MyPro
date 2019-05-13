package SQL.SQLjdbc;

/**
 * Created by ${纪雷} on 2019/4/28.
 */
public class User {
    private String nameid;
    private String password;
    private String phone;
    private String email;
    private String sex;

    public User(String nameid, String password, String phone, String email, String sex) {
        this.nameid = nameid;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "nameid='" + nameid + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {return sex;}

    public void setSex(String sex) {this.sex = sex;}
}
