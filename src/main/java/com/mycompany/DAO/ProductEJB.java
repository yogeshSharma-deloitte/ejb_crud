package com.mycompany.DAO;

import com.mycompany.Entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ProductEJB {

    @PersistenceContext(name="Deneme_Deneme_PU")
    private EntityManager em;

    public List<Product> getAllProducts(){
        TypedQuery<Product> sorgu = em.createNamedQuery("allProducts", Product.class);
        return sorgu.getResultList();
    }
}
