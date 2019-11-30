package ao.uan.fc.cc.helloprimefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {

  private String username = "joaojdacosta";
  private String password = "joaojdacosta";

  public String getUsername(){
    return this.username;
  }

  public void setUsername(String username){
    this.username = username;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public String showCredentials() {
    return "Credentials { username : " + this.username + ", password : " + this.password + "}";
  }
}