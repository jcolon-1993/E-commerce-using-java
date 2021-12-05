/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.controllers;

import games.business.Categories;

import games.business.Products;
import games.data.CategoryDB;
import games.data.DBUtil;
import games.data.ProductDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jimmy
 */
public class ProductsServlet extends HttpServlet {
    
    
    
    

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String paginationStr = this.getServletContext()
                .getInitParameter("pagination");
        
        
        
        String url = "/products.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        
        if (action == null) {
            action = "display_user";  // default action
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("display_user")) {
           
             
            String queryString = request.getQueryString(); 
            //List <Products> Products;
            if (queryString.contains("action=display_user&categoryID=1"))
            {
                int page = Integer.parseInt(request.getParameter("page"));
                int categoryId = Integer.parseInt(request.getParameter("categoryID"));
                String orderbyASCFlag = request.getParameter("orderByASC");
                Products code = ProductDB.selectProduct("1");
                
                

                int calcnum = Integer.parseInt(paginationStr);
                //int calcnum = Integer.parseInt(paginationStr);
                List<Products> numRecords = ProductDB.selectProductsById(1);
                List<Products> orderbyASC = ProductDB.OrderByAsc(page, calcnum, 1);
                List<Products>ProductsPerPage = ProductDB.pagination(page, calcnum, 1);
                int numOfPages =(int) Math.ceil(numRecords.size() * 1.0 / calcnum);
                request.setAttribute("flag", orderbyASCFlag);
                
                if (queryString.contains("orderByASC=true"))
                {
                    request.setAttribute("products", orderbyASC);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                }
                else
                {
                    request.setAttribute("products", ProductsPerPage);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                    request.setAttribute("code", code);
                    
                }
               
                RequestDispatcher view = request.getRequestDispatcher("products.jsp");
                view.forward(request, response);
                
                
            } 
            else if (queryString.contains("action=display_user&categoryID=2"))
            {
                
                int page = Integer.parseInt(request.getParameter("page"));
                int categoryId = Integer.parseInt(request.getParameter("categoryID"));
                String orderbyASCFlag = request.getParameter("orderByASC");

                int calcnum = Integer.parseInt(paginationStr);
                //int calcnum = Integer.parseInt(paginationStr);
                List<Products> numRecords = ProductDB.selectProductsById(2);
                List<Products> orderbyASC = ProductDB.OrderByAsc(page, calcnum, 2);
                List<Products>ProductsPerPage = ProductDB.pagination(page, calcnum, 2);
                int numOfPages =(int) Math.ceil(numRecords.size() * 1.0 / calcnum);
                request.setAttribute("flag", orderbyASCFlag);
                if (queryString.contains("orderByASC=true"))
                {
                    request.setAttribute("products", orderbyASC);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                }
                else
                {
                    request.setAttribute("products", ProductsPerPage);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                    
                }
                
                RequestDispatcher view = request.getRequestDispatcher("products.jsp");
                view.forward(request, response);
            }
            else if (queryString.contains("action=display_user&categoryID=3"))
            {
                
                int page = Integer.parseInt(request.getParameter("page"));
                int categoryId = Integer.parseInt(request.getParameter("categoryID"));
                String orderbyASCFlag = request.getParameter("orderByASC");
                
                
                
                int calcnum = Integer.parseInt(paginationStr);
                //int calcnum = Integer.parseInt(paginationStr);
                List<Products> numRecords = ProductDB.selectProductsById(3);
                List<Products> orderbyASC = ProductDB.OrderByAsc(page, calcnum, 3);
                List<Products>ProductsPerPage = ProductDB.pagination(page, calcnum, 3);
                int numOfPages =(int) Math.ceil(numRecords.size() * 1.0 / calcnum);
                
                request.setAttribute("flag", orderbyASCFlag);
                if (queryString.contains("orderByASC=true"))
                {
                    request.setAttribute("products", orderbyASC);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                }
                else if (queryString.contains("orderByASC=false"))
                {
                    request.setAttribute("products", ProductsPerPage);
                    request.setAttribute("noOfPages", numOfPages);
                    request.setAttribute("currentPage", page);
                    request.setAttribute("categoryID", categoryId);
                    
                    
                }
                
                RequestDispatcher view = request.getRequestDispatcher("products.jsp");
                view.forward(request, response);
            }
            
            
            url = "/products.jsp";
            }
        /*
        else if (action.equals("display_user")) {
            String emailAddress = request.getParameter("email");
            UserInfo user = UserDB.selectUser(emailAddress);
            session.setAttribute("user", user);
            url = "/user.jsp";
        }
        else if (action.equals("update_user")) {
            // get parameters from the request
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            

            // get and update user
            UserInfo user = (UserInfo) session.getAttribute("user");        
            user.setEmail(email);
            user.setFirstName(firstName);
            user.setLastName(lastName);
           
            UserDB.update(user);

            // get and set updated users
            List<UserInfo> users = UserDB.selectUsers();            
            request.setAttribute("users", users);            
        }
        else if (action.equals("delete_user")) {
            // get the user
            String email = request.getParameter("email");
            UserInfo user = UserDB.selectUser(email);
            
            // delte the user
            UserDB.delete(user);
            
            // get and set updated users
            List<UserInfo> users = UserDB.selectUsers();            
            request.setAttribute("users", users);            
        }
        */
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    
    private String showProducts(HttpServletRequest request, 
            HttpServletResponse response) {
        String productCode = request.getPathInfo();
        // This should never be null. But just to be safe.
        if (productCode != null) {
            
            productCode = productCode.substring(1);
            Products product = ProductDB.selectProduct(productCode);
            HttpSession session = request.getSession();
            session.setAttribute("product", product);
            
        }        
        return "/products/" + productCode;
    }
    
   
   @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
        
        String url =  showProducts(request, response);
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
       
        
        
    }
    
    
}
