package com.example.myapplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.manipulation.Ordering;
import org.mockito.Mock;


public class MyLoginTest {
    public final static String VALID="Login was successful";
    public final static String INVALID="Invalid login!";

    @Mock
    Context mock;

    @Test
    public void readStringFromContext_LocalizedString() {
        LoginActivity myObjectUnderTest = new LoginActivity(mock);
// ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("admin","admin");
// ...then the result should be the expected one.
        assertThat(result, is(VALID));
    }

    @Test
    public void readStringFromContext_ANdTEST() {
        LoginActivity myObjectUnderTest = new LoginActivity(mock);
// ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("notadmin","notadmin");
// ...then the result should be the expected one.
        assertThat(result, is(INVALID));
    }

}
