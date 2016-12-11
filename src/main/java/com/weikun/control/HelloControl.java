package com.weikun.control;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/11.
 */
@WebServlet(name="/HelloControl",urlPatterns = {"/hello"})
public class HelloControl extends HttpServlet {
    private Configuration cfg=null;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        Template tmp=cfg.getTemplate("hello.ftl");
        Map map=new HashMap();
        map.put("user","MIKE");
        try {
            tmp.process(map,out);
        } catch (TemplateException e) {
            e.printStackTrace();
        }

        out.flush();;
        out.close();
    }

    @Override
    public void init() throws ServletException {
        cfg=new Configuration(Configuration.VERSION_2_3_23);
        cfg.setServletContextForTemplateLoading(this.getServletContext(),"tmp");

        cfg.setDefaultEncoding("UTF-8");


        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        cfg.setLogTemplateExceptions(false);
    }
}
