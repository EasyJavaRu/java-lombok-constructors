package ru.easyjava.java.users;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void testConstructor() {
        User testedObject = new User(1L, "TEST");

        assertThat(testedObject.getId(), is(1L));
        assertThat(testedObject.getName(), is("TEST"));
    }

    @Test(expected = NullPointerException.class)
    public void testNullName() {
        new User(1L, null);
    }

    @Test
    public void testDefaultConstructor() {
        User testedObject = new User();

        assertNull(testedObject.getId());
        assertNull(testedObject.getName());
        assertNull(testedObject.getValue());
    }
}