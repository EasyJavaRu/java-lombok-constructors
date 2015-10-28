package ru.easyjava.java.accounts;

import org.junit.Test;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testChainedSetters() {
        User user = new User(1L, "TEST");

        Account testedObject = Account.create(1L, user, BigDecimal.ONE);

        assertThat(testedObject.getId(), is(1L));
        assertThat(testedObject.getOwner(), is(user));
        assertThat(testedObject.getAmount(), is(BigDecimal.ONE));
    }
}