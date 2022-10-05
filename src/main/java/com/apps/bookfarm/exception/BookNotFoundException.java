package com.apps.bookfarm.exception;

public class BookNotFoundException extends RuntimeException{
        public BookNotFoundException (Long id){
            super("Error. Could not find book with id: " + id);
        }
    }

