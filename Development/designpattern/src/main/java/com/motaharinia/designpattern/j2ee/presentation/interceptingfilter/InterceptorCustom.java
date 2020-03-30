package com.motaharinia.designpattern.j2ee.presentation.interceptingfilter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class InterceptorCustom implements HandlerInterceptor {
    private final String dbUsername = "admin";
    private final String dbPassword = "admin@1234";

    @Override
    public boolean preHandle(HttpServletRequest httpRequest, HttpServletResponse httpResponse, Object handler) throws Exception {
        // پارامترهای فرم وب برای لاگین را از درخواست وب میخوانیم
        String requestUsername = httpRequest.getParameter("username");
        String requestPassword = httpRequest.getParameter("password");
        if (dbUsername.equals(requestUsername) && dbPassword.equals(requestPassword)) {
            HttpSession session = httpRequest.getSession();
            session.setAttribute("user", "ashwani");
            //ست کردن تاریخ انقضای فرد لاگین شده برای یک ساعت
            session.setMaxInactiveInterval(60 * 60);
            Cookie userName = new Cookie("user", dbUsername);
            userName.setMaxAge(60 * 60);
            httpResponse.addCookie(userName);
            //خروجی تایید به اطلاعات لاگین در پاسخ وب
            httpResponse.addHeader("response","Login success");
        } else {
            //خروجی رد اطلاعات لاگین در پاسخ وب
            httpResponse.addHeader("response","Either username or password is wrong.");
        }
        System.out.println("InterceptorCustom.preHandle servletRequest.getParameter('username'):" + httpRequest.getParameter("username") + " servletResponse.getHeader('response'):" + httpResponse.getHeader("response") );
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("InterceptorCustom.postHandle servletRequest.getParameter('username'):" + servletRequest.getParameter("username") + " servletResponse.getHeader('response'):" + servletResponse.getHeader("response") );
    }

    @Override
    public void afterCompletion(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Object handler, Exception ex) throws Exception {
        System.out.println("InterceptorCustom.afterCompletion servletRequest.getParameter('username'):" + servletRequest.getParameter("username") + " servletResponse.getHeader('response'):" + servletResponse.getHeader("response") );
    }
}
