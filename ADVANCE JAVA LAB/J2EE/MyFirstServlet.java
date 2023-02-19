import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.GenericServlet;

public class MyFirstServlet implements GenericServlet {
    ServletConfig config = null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse resp)
            throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<html><body>");
        out.print("<b>hello Simple Servlet</b>");
        out.print("</body></html>");
    }

    public void destroy() {
        System.out.println("servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "copyright 2007-1010";
    }
}
