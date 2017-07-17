package com.db.client;

/**
 * @author Xiaowen
 * @Package com.db.client
 **/
public class Test {

    public static void main(String[] args) {
        MyWebService myWebService = new MyWebService_Service().getMyWebServicePort();
        String result = myWebService.say("world");
        System.out.println(result);
    }

}
