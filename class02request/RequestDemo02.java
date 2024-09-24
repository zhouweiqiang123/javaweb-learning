package topsoft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo02")
public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{


        Enumeration<String> names = req.getHeaderNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();

            String header = req.getHeader(name);
            System.out.println(name+":"+header);
        }


        String header = req.getHeader("User-Agent");
        if (header.contains("Edg")){
            System.out.println("Edg浏览器");
        }else {
            System.out.println("Chrome浏览器");
        }
    }
}
