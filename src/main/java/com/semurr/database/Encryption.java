package com.semurr.database;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Encryption {
	
	private static Random random;
	
	public static String createSalt(){
		
		byte[] salt = new byte[32];
		
		getRandom().nextBytes(salt);
		
		return byteToHex(salt);				
	}
	
	private static Random getRandom(){
		
		if(random == null){
			random = new SecureRandom();
		}		
		return random;		
	}
	
	public static String hashSha256(String salt, String hashVariable) throws NoSuchAlgorithmException{
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.update((salt + hashVariable).getBytes());

		return byteToHex(digest.digest());
	}
	
	
	
	private static String byteToHex(byte[] stringToModify) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < stringToModify.length; i++) {
			String hex = Integer.toHexString(0xff & stringToModify[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}

}
