package domain.validator;

import domain.Client;
import utils.validators.ValidatorsUtils;

public class ClientValidator implements Validator<Client> {
    @Override
    public void validate(Client client) throws ValidatorException {
        //String name check
        ValidatorsUtils.stringLengthLimitation("Name", client.getName(), 1, 50);

        //String name check
        ValidatorsUtils.stringLengthLimitation("Name", client.getEmail(), 1, 50);

        //String name check
        ValidatorsUtils.stringLengthLimitation("Name", client.getPhoneNumber(), 1, 50);


        //String address checks
        ValidatorsUtils.stringLengthLimitation("Address", client.getAddress(), 1, 100);

    }
}
