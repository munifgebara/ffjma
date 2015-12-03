/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.munif.ffjma;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munif
 */
@WebServlet(name = "FreeFormApi", urlPatterns = {"/api/*"})
public class FreeFormApi extends HttpServlet {
    
    private final ObjectMapper mapper = new ObjectMapper();
    

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doTrace(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doOptions(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doHead(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(getCollection(req));
        
        
        
        resp.setCharacterEncoding("UTF-8");
        
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("mensagem", "ola mundo!");
        
        mapper.writeValue(resp.getOutputStream(), map);
        resp.getOutputStream().close();

    }

    @Override
    public String getServletName() {
        return "ffjma";
    }

    @Override
    public String getServletInfo() {
        return "Free Form Java Mongo API";
    }

    private String getCollection(HttpServletRequest req) {
        String uri=req.getRequestURI();
        return uri.replaceFirst(".*/api/", "").replaceFirst("/.*", "");
    }
    
    
    
    
    

}
