package domain.validator;

import domain.Book;
import utils.validators.ValidatorsUtils;

public class BookValidator implements Validator<Book>{
    @Override
    public void validate(Book book) throws ValidatorException {
        //String title checks

        ValidatorsUtils.stringLengthLimitation("Title",book.getTitle(),1,100);

        //String author checks
        ValidatorsUtils.stringLengthLimitation("Author",book.getAuthor(),1,100);

        //Integer publicationYear checks
        ValidatorsUtils.yearNumber("Publication year",book.getPublicationYear());

        //String publisher checks
        ValidatorsUtils.stringLengthLimitation("Publisher",book.getPublisher(),1,100);

        //Integer price checks
        ValidatorsUtils.positiveNumber("Price",book.getPrice());
    }
}
