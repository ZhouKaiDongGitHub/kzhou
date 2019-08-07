package com.eis.webservice.wspoint.test;

import com.eis.webservice.wspoint.MobileCodeWS;
import com.eis.webservice.wspoint.MobileCodeWSSoap;

public class TestService {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap soap = mobileCodeWS.getMobileCodeWSSoap();
        String info = soap.getMobileCodeInfo("1886666", "");
        System.out.println(info);
    }
}
