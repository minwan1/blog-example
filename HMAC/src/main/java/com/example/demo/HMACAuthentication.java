package com.example.demo;

import org.springframework.stereotype.Component;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Component
public class HMACAuthentication {

    public void verifySignature(String secret, String payload, String signature) {
        try {
            final String resultHex = getHexHash(secret, payload);
            if (!resultHex.equals(signature))
                throw new HMACAuthenticationFailException("HAMC ERROR");
        } catch (Exception e) {
            throw new HMACAuthenticationFailException("HAMC ERROR", e);
        }
    }

    private String getHexHash(String secret, String payload) throws NoSuchAlgorithmException, InvalidKeyException {
        final String hmacSHA256 = "HmacSHA256";
        final Mac hasher = Mac.getInstance(hmacSHA256);
        hasher.init(new SecretKeySpec(secret.getBytes(), hmacSHA256));
        final byte[] hash = hasher.doFinal(payload.getBytes());

//            String resultBase = DatatypeConverter.printBase64Binary(hash); // to base64
        return DatatypeConverter.printHexBinary(hash).toLowerCase();
    }


}
