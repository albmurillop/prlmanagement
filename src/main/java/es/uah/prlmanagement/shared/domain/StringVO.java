package es.uah.prlmanagement.shared.domain;

import java.util.Objects;

public abstract class StringVO {

    private final String value;

    public StringVO(String value) {
        ensureValueNonNull(value);
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
        StringVO stringVO = (StringVO) o;
        return value.equals(stringVO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValueNonNull(String value) {
        if (Objects.isNull(value)) {
            throw new ValueObjectIsNull();
        }
    }
}
