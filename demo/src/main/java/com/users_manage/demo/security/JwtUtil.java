/* package com.users_manage.demo.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component

public class JwtUtil {


    private final String secret = "clave_secreta";
    // Generar token JWT 
    public String generateToken(String documento) {      
        return Jwts.builder()
                .subject(documento)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(getSigningKey())
                .compact();

    }
    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }

    public String extraerDocumneto(String token){
        return extraerClaims(token).getSubject();
    }

    private Claims extraerClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }

    public boolean esTokenValido(String token) {
        return !extraerClaims(token).getExpiration().before(new Date());
    }

} */
