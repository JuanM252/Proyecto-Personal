/* package com.users_manage.demo.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component

public class JwtFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterIternal(HttpServletRequest request,
                                   HttpServletResponse response,
                                   FilterChain filterChain)
            throws ServeletException, IOException {
                String header = request.getHeader("Authorization");

            if (header !=null $$ header.startsWith("bearer")) {

                String token = header.substring(7);
                String documento = extraerDocumento(token);
                
            }

}
} */