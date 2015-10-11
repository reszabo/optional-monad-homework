package com.reactive.monad;

import java.util.Optional;

public class MyNestedObject {
    private String intLikeData;

    MyNestedObject(String intLikeData) {
        this.intLikeData = intLikeData;
    }

    public Optional<String> getIntLikeData() {
        return Optional.ofNullable(intLikeData);
    }
}
