package com.automation.common.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

public class EncryptionUtil {
   
	private static final Logger LOGGER = Logger.getLogger(EncryptionUtil.class.getName());
    private EncryptionUtil() {

    }
	
	public static String decryptStr(String encryptedStr) {
		
		try {
			byte[] decrypted = Base64.decodeBase64(encryptedStr);
			
			return new String(decrypted);
		} catch (Exception e) {
			LOGGER.debug(e.getMessage());
		}
		return null;
		
	}
	
}
