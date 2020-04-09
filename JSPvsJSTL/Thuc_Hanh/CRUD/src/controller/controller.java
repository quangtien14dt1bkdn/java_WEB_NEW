package controller;

import data.CustomerData;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static data.CustomerData.ListCustomer;


@javax.servlet.annotation.WebServlet(name = "controller", urlPatterns = "/")

public class controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/new":
                break;
            case "/delete":
                break;
            case "edit":
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = CustomerData.getAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher  dispatcher = request.getRequestDispatcher("customer/home.jsp");
        dispatcher.forward(request,response);
    }
}
