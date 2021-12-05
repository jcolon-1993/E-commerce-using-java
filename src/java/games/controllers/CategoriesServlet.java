package games.controllers;

//import games.business.Products;
import games.business.Categories;
import games.business.Products;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

//import games.business.User;
import games.data.CategoryDB;
import games.data.ProductDB;
//import games.data.ProductDB;
//import games.data.UserDB;

public class CategoriesServlet extends HttpServlet {
    
   
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String url;

        url = "/index.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "display_users";  // default action
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of categories
            List<Categories> categories = CategoryDB.selectCategories(); 
            //List<Products> categories = ProductDB.selectProductsById(1);
            request.setAttribute("categories", categories);
            
            
        } 
        
        else if (action.equals("display_user")) {
            List<Products> Products = ProductDB.selectProducts(); 
            
            request.setAttribute("products", Products);
            
            String requestURI = request.getRequestURI();
            List<Categories> categories = CategoryDB.selectCategories(); 
            
            url = showProducts(request, response);
            

            url = "/products.jsp";
            }
        else if (action.equals("update_user")) {
            // get parameters from the request
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            

            // get and update user
            //User user = (User) session.getAttribute("user");        
            //user.setEmail(email);
            //user.setFirstName(firstName);
            //user.setLastName(lastName);
           
            //UserDB.update(user);

            // get and set updated users
            //List<User> users = UserDB.selectUsers();            
            //request.setAttribute("users", users);            
        }
        else if (action.equals("delete_user")) {
            // get the user
            //String email = request.getParameter("email");
            //User user = UserDB.selectUser(email);
            
            // delte the user
            //UserDB.delete(user);
            
            // get and set updated users
            //List<User> users = UserDB.selectUsers();            
            //request.setAttribute("users", users);            
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    
    private String showProducts(HttpServletRequest request, 
            HttpServletResponse response) {
        String categoryID = request.getPathInfo();
        // This should never be null. But just to be safe.
        if (categoryID != null) {
            
            
            categoryID = categoryID.substring(1);
            //List <Products> category = ProductDB.selectProductsById(1);
            HttpSession session = request.getSession();
            //session.setAttribute("category", category);
        }        
        return "/products/" + categoryID;
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    
    
    
}