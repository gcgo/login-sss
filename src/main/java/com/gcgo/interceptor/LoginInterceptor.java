package com.gcgo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    //执行用户登录校验
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取session
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("USER_LOGIN");
        //判断session中是否有用户数据，如果有，则放行
        if (username != null) {
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg", "您还没有登录，请先登录！");
        System.out.println("请先登录");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
