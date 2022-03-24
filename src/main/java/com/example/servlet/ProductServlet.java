package com.example.servlet;
import model.Product;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "ProductServlet", urlPatterns = "/product_servlet")

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setAttribute("products",createProducts());
            getServletContext().getRequestDispatcher("/products.jsp")  //перенаправление на products.jsp
                    .forward(req,resp);
    }

    private Product createProducts() {
        List<Product>products = List.of(   //создаём список продуктов
                new Product(1,"milk",70),
                new Product(2,"bread",50),
                new Product(3,"eggs",80),
                new Product(4,"cheese",150),
                new Product(5,"sausage",250),
                new Product(6,"pasta",150),
                new Product(7,"water",50),
                new Product(8,"biscuit",100),
                new Product(9,"chicken",300),
                new Product(10,"candies",200)
        );
        return Product.builder()
                .products(products)
                .build();
    }

}
