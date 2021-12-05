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
public class CategoryDB 
{
    
    
     public static List<Categories> selectCategories() {
         
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT c from Categories c";
        TypedQuery<Categories> q = em.createQuery(qString, Categories.class);

        List<Categories> categories;
        try {
            categories = q.getResultList();
            if (categories == null || categories.isEmpty())
                categories = null;
        } finally {
            em.close();
        }
        return categories;
    }
}
