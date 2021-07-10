package es.uah.prlmanagement.shared.domain;

public class DomainException extends RuntimeException {

    private final String message;

    public DomainException(String message) {
        super(message);
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
