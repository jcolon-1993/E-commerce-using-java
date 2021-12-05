/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.data;


import games.business.Categories;
import games.business.Products;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author jimmy
 */
public class ProductDB {
    
    public static List<Products> selectProducts() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p from Products p";
        TypedQuery<Products> q = em.createQuery(qString, Products.class);

        List<Products> products;
        try {
            products = q.getResultList();
            if (products == null || products.isEmpty())
                products = null;
        } finally {
            em.close();
        }
        return products;
    }
    
    
    
    public static List<Products> selectProductsById(int categoryID) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p FROM Products p " +
                "WHERE p.categoryID.categoryID = :categoryID";
        Products products = new Products();
        TypedQuery<Products> q = em.createQuery(qString, Products.class);
        
        
        List<Products> productsByCat = null;
        try {
            
            q.setParameter("categoryID", categoryID);
            productsByCat = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return productsByCat;
    }
    
    public static List<Products> pagination(int page, int numRecords, int categoryID) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p FROM Products p " + 
                "WHERE p.categoryID.categoryID = :categoryID";
        
        TypedQuery<Products> q = em.createQuery(qString, Products.class);
        int pageNumber = 1;
        
        q.setFirstResult((page-1) * numRecords); 
        q.setMaxResults(numRecords);
        List<Products> products;
        try {
            q.setParameter("categoryID", categoryID);
            products = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return products;
    }
    
    public static List<Products> OrderByAsc(int page, int numRecords, int categoryID) {
        
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p FROM Products p " + 
                "WHERE p.categoryID.categoryID = :categoryID ORDER BY p.price ASC";
       
        TypedQuery<Products> q = em.createQuery(qString, Products.class);
        int pageNumber = 1;
        
        q.setFirstResult((page-1) * numRecords); 
        q.setMaxResults(numRecords);
        List<Products> products;
        try {
            q.setParameter("categoryID", categoryID);
            products = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return products;
    }
    
    public static Products selectProduct(String code) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p FROM Products p " +
                "WHERE p.code = :code";
        TypedQuery<Products> q = em.createQuery(qString, Products.class);
        q.setParameter("code", code);
        Products result = null;
        try {
            result = q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return (Products)result;
    }
    
}
