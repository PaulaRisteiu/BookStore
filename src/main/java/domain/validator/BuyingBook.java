package domain.validator;

import domain.BaseEntity;
import domain.Book;
import domain.Client;

public class BuyingBook {

    public static <T extends BaseEntity<?>> Validator<T> getValidator(Class<T> classType) {
        if (classType == Book.class) {
            return (Validator<T>) new BookValidator();
        } else if (classType == Client.class) {
            return (Validator<T>) new ClientValidator();
        }
        throw new BlockBuster("No validator found for entity type: " + classType.getName());
    }
}
