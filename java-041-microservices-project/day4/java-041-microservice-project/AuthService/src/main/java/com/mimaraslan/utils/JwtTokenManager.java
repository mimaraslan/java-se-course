package com.mimaraslan.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JwtTokenManager {
/*
    String secretKey = "Ankara06";

    String issuer = "abc";

    Long expireDate = 1000L * 60 * 5; // 5 dakika
*/


    @Value("${authservice.secret.key}")
    String secretKey;

    @Value("${authservice.issuer}")
    String issuer;

    @Value("${authservice.expire.date}") // 1000L * 60 * 5 // 5 dakika
    Long expireDate;



    // 1. adım: Token üret.
    public Optional<String> createToken (Long id){
       String token = "";
        try {

               token = JWT.create().withAudience()
                       .withClaim("id", id)
                       .withClaim("serviceName", "AuthService")
                       .withIssuer(issuer) // jwt tokeni olusturan yapi kurum
                       .withIssuedAt(new Date()) // tokenin olusturulma zamani
                       .withExpiresAt(new Date(System.currentTimeMillis() + expireDate))
                       .sign(Algorithm.HMAC512(secretKey));
               return Optional.of(token);

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }

    }

    // 2. adım: Token doğrula.
    public Boolean verifyToken (String token){
       try {

           Algorithm algorithm = Algorithm.HMAC512(secretKey);
           JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
           DecodedJWT decodeJWT = verifier.verify(token);

           if(decodeJWT == null){
               return false;
           }

       } catch (Exception e) {
           e.printStackTrace();
           return false;
       }

       return true;
    }

    // 3. adım: Token içindeki bilgiyi çöz ve çıkar.
    public Optional<Long> getIdInfoFromToken(String token){
        try {

            Algorithm algorithm = Algorithm.HMAC512(secretKey);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
            DecodedJWT decodeJWT = verifier.verify(token);

            if(decodeJWT == null){
                return Optional.empty();
            }

            Long id = decodeJWT.getClaim("id").asLong();
            System.out.println("Tokendaki id değeri: " + id);

            String serviceName = decodeJWT.getClaim("serviceName").asString();
            System.out.println("Tokendaki serviceName değeri: " + serviceName);

            return Optional.of(id);


        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

}
