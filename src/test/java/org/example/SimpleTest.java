package org.example;

import org.example.service.IDK;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test(){
        IDK idk = new IDK();
        Assert.assertEquals("702550",idk.levenstein("lvvi"));
    }

}
