package com.yinlipuhui.Encrypt;

import static org.junit.Assert.*;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class EncryptTest {

	@Test
	public void test() {
		 //待加密内容
        String str = "你好";
        //密码是您的用户ID（即用户名，不是openid）的前8位，不足8位则用数字0补齐
        String password = "juhe0000";
         
        //DES加密
        byte[] result = Encrypt.desCrypto(str.getBytes(),password);
        System.out.println("DES加密后内容为："+new String(result));
        //Base64加密
        byte[] b = Base64.encodeBase64(result, true);
        System.out.println("Base64加密后内容为："+new String(b));
         
        //Base64解密
        byte[] bb = Base64.decodeBase64(b);
        System.out.println("Base64解密后内容为："+new String(bb));
        //DES解密
        try {
            byte[] decryResult = Encrypt.decrypt(bb, password);
            System.out.println("DES解密后内容为："+new String(decryResult));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
	}

}
