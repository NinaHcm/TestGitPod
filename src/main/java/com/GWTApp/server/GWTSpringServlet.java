package com.GWTApp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <br/><i>A.Komarov on 21.06.2018.</i>
 */
public abstract class GWTSpringServlet extends RemoteServiceServlet implements Controller, ServletContextAware {

    private ServletContext servletContext;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        super.doPost(request, response);
        return null;
    }

    @Override
    public ServletContext getServletContext() {
        return servletContext;
    }


    @Override
    @RequestMapping
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

}

