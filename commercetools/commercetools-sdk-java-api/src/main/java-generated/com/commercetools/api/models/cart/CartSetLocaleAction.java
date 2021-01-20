
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartSetLocaleActionImpl;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLocaleActionImpl.class)
public interface CartSetLocaleAction extends CartUpdateAction {

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static CartSetLocaleAction of() {
        return new CartSetLocaleActionImpl();
    }

    public static CartSetLocaleAction of(final CartSetLocaleAction template) {
        CartSetLocaleActionImpl instance = new CartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static CartSetLocaleActionBuilder builder() {
        return CartSetLocaleActionBuilder.of();
    }

    public static CartSetLocaleActionBuilder builder(final CartSetLocaleAction template) {
        return CartSetLocaleActionBuilder.of(template);
    }

    default <T> T withCartSetLocaleAction(Function<CartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
