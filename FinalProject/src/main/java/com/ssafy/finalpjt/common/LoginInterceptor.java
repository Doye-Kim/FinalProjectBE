package com.ssafy.finalpjt.common;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.finalpjt.user.dto.UserDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor{

    // 요청마다 매번 작성하지 말고 final 로  
    private final String jsonStr = "{\"result\":\"login\"}";
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // exclude 요청에는 아래 출력 X
        System.out.println("LoginInterceptor >>>> " + request.getRequestURI());
        System.out.println(handler);
        
        // CORS 에서  put, delete 등 오류 해결 코드
        if (request.getMethod().equals("OPTIONS")) {
            return true;
        }
        
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute("userDto");

        if( userDto == null ) {
            response.getWriter().write(jsonStr);            
            return false;
        }

        return true;
    }
}