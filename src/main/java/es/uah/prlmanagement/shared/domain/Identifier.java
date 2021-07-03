package es.uah.prlmanagement.shared.domain;

import java.io.Serializable;
import java.util.Objects;

import static java.util.UUID.fromString;

public class Identifier implements Serializable {

    private String value;

    public Identifier(String value) {
        ensureValidUUID(value);
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Identifier that = (Identifier) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValidUUID(String value) throws IllegalArgumentException {
        fromString(value);
    }
}
