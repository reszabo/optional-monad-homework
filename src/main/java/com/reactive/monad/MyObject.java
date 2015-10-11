package com.reactive.monad;

import java.util.Optional;

public class MyObject {
    private MyNestedObject nested;

    MyObject(MyNestedObject nested) {
        this.nested = nested;
    }

    public Optional<MyNestedObject> getNested() {
        return Optional.ofNullable(nested);
    }
}
