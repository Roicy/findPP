package com.example.myfirstspringbootweb.interceptor;

import com.example.myfirstspringbootweb.Constant.UserConstant;
import com.example.myfirstspringbootweb.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


import java.io.IOException;
import java.util.Objects;


@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        User user = (User) request.getSession().getAttribute(UserConstant.USER);

        if (Objects.nonNull(user) ) {
            return true;
        } else {
            response.sendRedirect(request.getContextPath() + "/*");
            return false;
        }
    }


}
