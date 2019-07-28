package com.liyan.servlet;

import com.liyan.pojo.Airport;
import com.liyan.service.AirPortService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showLandAirPort")
public class ShowLandServlet extends HttpServlet {
    private AirPortService airPortService;

    @Override
    public void init() throws ServletException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        airPortService = webApplicationContext.getBean("airPortService", AirPortService.class);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> list=airPortService.showLandAirPort();
        req.setAttribute("land",list);
        req.getRequestDispatcher("showairplane").forward(req,resp);
    }
}
