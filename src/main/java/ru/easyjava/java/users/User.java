package ru.easyjava.java.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import java.math.BigDecimal;

/**
 * Sample user entity
 */
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class User {
    /**
     * Id.
     */
    @Getter
    private Long id;

    /**
     * User name.
     */
    @Getter
    @NonNull
    private String name;

    /**
     * Some entity, that you can't set.
     */
    @Getter
    @Setter
    @NonFinal
    BigDecimal value;
}
