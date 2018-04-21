package com.controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * * <p>Title:ViewFile </p>
   * <p>Description: </p>
   * <p>Company: </p> 
   * @author Hy 
   * @date 2018年4月21日 下午9:49:57
 */

//查看文件
@WebServlet(name = "ViewFile",urlPatterns = "/ViewFile")
public class ViewFile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //写处理的代码
    
    
    }
       
}

