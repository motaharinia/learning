package com.motaharinia.designpattern.j2ee.presentation.interceptingfilter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(2)
public class FilterCustom2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    /**
     * این متد قبل از ورود request و response به Spring Contextدر WebContainer اطلاعات request و response را فیلتر میکند
     * @param servletRequest درخواست وب
     * @param servletResponse پاسخ درخواست وب
     * @param filterChain زنجیره فیلترها
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String filterRunOrder = httpResponse.getHeader("filterRunOrder");
        httpResponse.setHeader("filterRunOrder", filterRunOrder + ",2");
        System.out.println("FilterCustom2.doFilter httpResponse.getHeader('filterRunOrder'):" + httpResponse.getHeader("filterRunOrder") );
        filterChain.doFilter(servletRequest, httpResponse);
    }

    @Override
    public void destroy() {
    }
}
