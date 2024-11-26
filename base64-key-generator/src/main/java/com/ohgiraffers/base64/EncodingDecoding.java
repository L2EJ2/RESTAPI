package com.ohgiraffers.base64;

import java.util.Base64;
import java.util.Base64.*;

public class EncodingDecoding {

    public static void main(String[] args) {

        //
        Encoder encoder = Base64.getEncoder();
        Decoder decoder = Base64.getDecoder();

        String plainText = "집에가고싶은데요";
        byte[] plainTextToByteArr = plainText.getBytes();

        byte[] encodedArr = encoder.encode(plainTextToByteArr);

        String encodedStr = new String(encodedArr);
        System.out.println("인코딩쉬먀?" + encodedStr);
    }
}
