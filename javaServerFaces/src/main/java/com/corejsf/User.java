package com.corejsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean; 
   // or import javax.inject.Named;
import javax.faces.bean.SessionScoped; 
   // or import javax.enterprise.context.SessionScoped;
 
@ManagedBean(name="user") // or @Named("user")
@SessionScoped     
public class User implements Serializable {
  private String name;
  private String password;
  
  public String getName() { return name; }
  public void setName(String newValue) { name = newValue; }
    
  public String getPassword() { return password; }
  public void setPassword(String newValue) { password = newValue; }  
}
