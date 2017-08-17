package com.store.util;


import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
public class userinfotoken {
	private static final String SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
	public static String  createToken(com.store.model.user user) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("alg","HS256");
		map.put("typ","JWT");
		String token=JWT.create()
		.withHeader(map)//header
		.withClaim("tUseraccount",user.gettUseraccount())//payload
		.withClaim("tUserpw",user.gettUserpw())
		.sign(Algorithm.HMAC256("secret"));//加密
		return token;}
	
	public static Map<String,Claim> verifyToken(String token,String key) throws Exception{
			JWTVerifier verifier=JWT.require(Algorithm.HMAC256("secret"))
										.build();
			DecodedJWT jwt=verifier.verify(token);
			Map<String,Claim> claims=jwt.getClaims();
			return claims;
	}

}
