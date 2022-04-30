package pri.hongweihao.ch02.ch02_5_interface_segregation_principle;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;

public class JwtToken implements IToken, ITokenGenerator, ITokenParser {
    private final String key = "xxxxx";

    @Override
    public String generate(String userId, Date expire) {
        return JWT.create()
                .withClaim("userId", userId)
                .withExpiresAt(expire)
                .sign(Algorithm.HMAC256(key));
    }

    @Override
    public String parse(String token) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(key)).build();
        DecodedJWT verify = jwtVerifier.verify(token);
        return verify.getClaim("userId").asString();
    }
}
