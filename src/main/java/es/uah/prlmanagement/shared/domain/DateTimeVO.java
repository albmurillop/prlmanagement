package es.uah.prlmanagement.shared.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class DateTimeVO {

    private final LocalDateTime value;

    public DateTimeVO(LocalDateTime value) {
        ensureValueNonNull(value);
        this.value = value;
    }

    public LocalDateTime value() {
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
        DateTimeVO dateTimeVO = (DateTimeVO) o;
        return value.equals(dateTimeVO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private void ensureValueNonNull(LocalDateTime value) {
        if (Objects.isNull(value)) {
            throw new ValueObjectIsNull();
        }
    }
}
