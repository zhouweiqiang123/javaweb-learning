package topsoft.class01servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet(value = "/demo3",name = "demo3")
public class ServletDEMO3 implements Servlet {
    /**
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDEMO3  初始化");
    }

    /**
     *
     * @return
     */

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       servletResponse.getWriter().write("servletDEMO3 执行");
        System.out.println("service 执行");
    }

    /**
     *
     * @return
     */

    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     *
     */
    @Override
    public void destroy() {
        System.out.println("销毁方法");

    }
}
