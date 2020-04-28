package model.mysql;

public class MySQLObjectException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MySQLObjectException(String message) {
        super(message);
    }
}