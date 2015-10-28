package ru.easyjava.java.accounts;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

/**
 * Sample account entity.
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "create")
public class Account {
    /**
     * Id.
     */
    @Getter
    @Setter
    Long id;

    /**
     * Account owner.
     */
    @NonNull
    @Getter
    @Setter
    User owner;

    /**
     * Account's value.
     */
    @Getter
    @Setter
    BigDecimal amount;
}
