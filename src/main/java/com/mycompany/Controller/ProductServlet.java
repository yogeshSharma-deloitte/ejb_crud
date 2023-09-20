package com.mycompany.Controller;

import com.mycompany.Entity.Product;
import com.mycompany.service.UserBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MstfDryl
 */

@ManagedBean(name="product")
@RequestScoped
public class ProductServlet {

    FacesContext context = FacesContext.getCurrentInstance();

    private Product product;

    @EJB
    UserBean userBean;

    public void getAllProducts(){
        product = new Product();
        Long count = userBean.getProductCount();
        System.out.println(count);
    }

}
