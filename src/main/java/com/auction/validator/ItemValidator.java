package com.auction.validator;

import com.auction.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ItemValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Item.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Item item = (Item) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        if (item.getName().length() < 3 ) {
            errors.rejectValue("name", "Size.item.name");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lowPrice", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "actualPrice", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "intervalEnd", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categories", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "photo", "NotEmpty");


    }
}
