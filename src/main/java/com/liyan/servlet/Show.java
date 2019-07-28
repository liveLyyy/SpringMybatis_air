package com.liyan.servlet;

import com.liyan.pojo.Airplane;
import com.liyan.service.AirPlaneService;
import com.liyan.service.AirPortService;
import com.liyan.service.Impl.AirPortServiceImpl;
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

@WebServlet("/showairplane")
public class Show extends HttpServlet {
    private AirPlaneService airPlaneService;

    @Override
    public void init() throws ServletException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        airPlaneService = webApplicationContext.getBean("airPlaneService", AirPlaneService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int takeid = 0;
        int landid = 0;
        String takeidstr = req.getParameter("takeid");
        String landidstr = req.getParameter("landid");
        if (takeidstr != null && !takeidstr.equals("")) {
            takeid = Integer.parseInt(takeidstr);
        }
        if (landidstr != null && !landidstr.equals("")) {
            landid = Integer.parseInt(landidstr);
        }
        List<Airplane> list=airPlaneService.showTakeLan(takeid,landid);
        req.setAttribute("list",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
