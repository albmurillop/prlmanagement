package es.uah.prlmanagement.shared.domain;

public class ValueObjectIsNull extends DomainException {

    public ValueObjectIsNull() {
        super("The value object is null");
    }
}
