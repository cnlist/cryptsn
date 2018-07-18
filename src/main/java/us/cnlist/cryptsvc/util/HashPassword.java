package us.cnlist.cryptsvc.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashPassword {

    private static final String MD_ALGORITHM = "SHA1";

    private HashPassword() {
    }

    public static byte[] hash(String passwd) {
        try {
            return MessageDigest.getInstance(MD_ALGORITHM)
                    .digest(passwd.getBytes());
        } catch (NoSuchAlgorithmException nse) {
            return null;
        }

    }

}
