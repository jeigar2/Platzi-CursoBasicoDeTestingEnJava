package es.jesustfk.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeatStringMultipleTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3) );
    }

    @Test
    public void repeatStringOnce() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeatStringZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola", -1));
    }

    @Test
    public void string_is_not_empty() { Assert.assertFalse(StringUtil.isEmpty("PEPE"));  }

    @Test
    public void string_empty_is_empty() { Assert.assertTrue(StringUtil.isEmpty(""));  }

    @Test
    public void string_null_is_empty() { Assert.assertTrue(StringUtil.isEmpty(null));  }

    @Test
    public void string_with_spaces_is_empty() { Assert.assertTrue(StringUtil.isEmpty("  "));  }
}