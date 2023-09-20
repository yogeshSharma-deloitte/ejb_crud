package com.mycompany.Controller;

import com.mycompany.Entity.User;
import com.mycompany.service.UserBean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MstfDryl
 */

@ManagedBean(name="user")
@RequestScoped
public class UserServlet {
    
    FacesContext context = FacesContext.getCurrentInstance();
        
    private User user;

    @EJB
    UserBean userBean;
    
    private List<User> userList = new ArrayList();
    
    @PostConstruct
    public void getAllUsers(){
        user = new User();
        userList = userBean.getAllUsers();
        
    }

    public String editUser(){
                System.out.println("--------------------1--------------------------------");
        System.out.println("--------------------1--------------------------------");
        System.out.println(this.user.getId());
        System.out.println("--------------------1--------------------------------");
        System.out.println("--------------------1--------------------------------");

        
        if(!this.user.getEmail().contains("@") || !this.user.getEmail().contains("."))
        {
            context.addMessage(null, new FacesMessage("Geçersiz e-Mail adresi"));
            return null;
        }

        try
        {
        System.out.println("--------------------1--------------------------------");
        System.out.println("---------------------2-------------------------------");
            userBean.editUser(this.user.getId(),this.user);
            
        System.out.println("--------------------3--------------------------------");
            userList = userBean.getAllUsers();
            
        System.out.println("---------------------4-------------------------------");
            return "index.xhtml?faces-redirect=true";
        }
        catch(Exception e)
        {
            context.addMessage(null, new FacesMessage("Kullanıcı Güncellerken Hata Oluştu... \n "+e));
            return null;
        }
        
    }
    
    public String addUser(){
        try
        {
            if(!user.getEmail().contains("@") || !user.getEmail().contains("."))
            {
                context.addMessage(null, new FacesMessage("Geçerli e-Mail değil"));
                return null;
            }
                
            
            user = userBean.saveUser(user);
            
            userList = userBean.getAllUsers();
            
            context.addMessage(null, new FacesMessage("Kullanıcı Başarı ile Eklendi..."));
            return "index.xhtml?faces-redirect=true";
        }
        catch(Exception e)
        {
            context.addMessage(null, new FacesMessage("Kullanıcı Eklenirken Hata Oluştu... \n "+e));
            return null;
        }
    }

    public String deleteUser(Long id){
        try
        {
            userBean.deleteUser(id);
            userList = userBean.getAllUsers();
            
            context.addMessage(null, new FacesMessage("Kullanıcı Başarı ile Silindi..."));
            return "index.xhtml?faces-redirect=true";
        }
        catch(Exception e)
        {
            context.addMessage(null, new FacesMessage("Kullanıcı Silinirken Hata Oluştu... \n "+e));
            return null;
        }
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
}
