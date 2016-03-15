package org.resteasy.test.ejb;

import javax.ejb.Stateless;

/**
 * Created by ee37845 on 14/03/16.
 */
@Stateless
public class OtherResourceBean {
    public String getBasic()
    {
        System.out.println("getBasic()");
        return "basic";
    }
}
