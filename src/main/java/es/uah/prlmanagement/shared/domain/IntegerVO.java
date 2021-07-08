package es.uah.prlmanagement.shared.domain;

import java.util.Objects;

public abstract class IntegerVO {

    private Integer value;

    public IntegerVO(Integer value) {
        ensureValueNonNull(value);
        this.value = value;
    }

    public Integer value() {
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
        IntegerVO integerVO = (IntegerVO) o;
        return value.equals(integerVO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValueNonNull(Integer value) {
        if (Objects.isNull(value)) {
            throw new ValueObjectIsNull();
        }
    }
}
