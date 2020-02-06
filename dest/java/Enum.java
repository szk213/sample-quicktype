package io.quicktype;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Enum {
    ABC;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ABC: return "ABC";
        }
        return null;
    }

    @JsonCreator
    public static Enum forValue(String value) throws IOException {
        if (value.equals("ABC")) return ABC;
        throw new IOException("Cannot deserialize Enum");
    }
}
