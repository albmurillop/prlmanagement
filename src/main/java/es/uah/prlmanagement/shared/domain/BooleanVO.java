package es.uah.prlmanagement.shared.domain;

import java.util.Objects;

public abstract class BooleanVO {

    private Boolean value;

    public BooleanVO(Boolean value) {
        ensureValueNonNull(value);
        this.value = value;
    }

    public Boolean value() {
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
        BooleanVO booleanVO = (BooleanVO) o;
        return value.equals(booleanVO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValueNonNull(Boolean value) {
        if (Objects.isNull(value)) {
            throw new ValueObjectIsNull();
        }
    }
}
