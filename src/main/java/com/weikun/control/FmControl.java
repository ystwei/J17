package com.weikun.control;

import com.weikun.po.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/11.
 */
@WebServlet(name="/f",urlPatterns = {"*.do"})
public class FmControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path=req.getServletPath();//if.do
        int index=path.lastIndexOf(".");
        String name=path.substring(1,index);
        Template tmp=cfg.getTemplate(name+".ftl");

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        PrintWriter out=resp.getWriter();
        Map map =new HashMap();
        map.put("score",900);
        map.put("msg","<b>我是哈尔滨人</b>");

        map.put("users",Arrays.asList(new User("Mike","999"),new User("Jack","888")));
        try {
            tmp.process(map,out);
        } catch (TemplateException e) {
            e.printStackTrace();
        }

        out.flush();
        out.close();
    }
    private Configuration cfg=null;
    @Override
    public void init() throws ServletException {
        cfg=new Configuration(Configuration.VERSION_2_3_23);

        cfg.setServletContextForTemplateLoading(this.getServletContext(),"tmp");

        cfg.setDefaultEncoding("utf-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        cfg.setLogTemplateExceptions(false);


    }
}
