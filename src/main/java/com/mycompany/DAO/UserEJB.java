/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import com.mycompany.Entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author MstfDryl
 */
@Stateless
public class UserEJB {
    
    @PersistenceContext(name="Deneme_Deneme_PU")
    private EntityManager em;
    
    public List<User> getAllUsers(){
        TypedQuery<User> sorgu = em.createNamedQuery("allUsers", User.class);
        return sorgu.getResultList();
    }
    
    public User getXUser(String username){
        return em.find(User.class, username);
    }
    
    public User getXEmail(String email){
        return em.find(User.class, email);
    }

    public User getXId(Long id){
        return em.find(User.class, id);
    }

    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User saveUser(User user){
        em.persist(user);
        em.flush();
        return user;
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User mergeUser(User user){
        
        System.out.println("--------------------5--------------------------------");
        System.out.println(user.getId());
        System.out.println("----------------------6------------------------------");
        em.merge(em.find(User.class,user.getId()));
        
        System.out.println("------------------------7----------------------------");
        return user;
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void deleteUser(User user) throws Exception{
        try
        {
            em.remove(em.merge(user));
            em.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User editUser(User user) throws Exception {
        try
        {
            em.merge(user);
            em.flush();
            return user;
        }
        catch(Exception e)
        {
            
            System.out.println(e);
            return null;
        }
    }
    
}
