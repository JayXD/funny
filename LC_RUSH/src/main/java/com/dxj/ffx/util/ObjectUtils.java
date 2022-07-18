package com.dxj.ffx.util;

import java.util.function.Function;

public class ObjectUtils {
    public ObjectUtils() {
    }

    public static <T> T defaultIfNull(T input, T defaultValue) {
        return input == null ? defaultValue : input;
    }

    public static <T, R> R defaultIfNull(T input, Function<T, R> mapper, R defaultValue) {
        return input == null ? defaultValue : mapper.apply(input);
    }

    public static <T, R> R nullIfNull(T input, Function<T, R> mapper) {
        return input == null ? null : mapper.apply(input);
    }
}
