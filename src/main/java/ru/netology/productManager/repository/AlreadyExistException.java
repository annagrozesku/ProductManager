package ru.netology.productManager.repository;

public class AlreadyExistException extends RuntimeException {

    public AlreadyExistException(String msg) {
        super(msg);
    }
}
