
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetCustomTypeActionImpl.class)
public interface MyShoppingListSetCustomTypeAction extends MyShoppingListUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyShoppingListSetCustomTypeAction of() {
        return new MyShoppingListSetCustomTypeActionImpl();
    }

    public static MyShoppingListSetCustomTypeAction of(final MyShoppingListSetCustomTypeAction template) {
        MyShoppingListSetCustomTypeActionImpl instance = new MyShoppingListSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyShoppingListSetCustomTypeActionBuilder builder() {
        return MyShoppingListSetCustomTypeActionBuilder.of();
    }

    public static MyShoppingListSetCustomTypeActionBuilder builder(final MyShoppingListSetCustomTypeAction template) {
        return MyShoppingListSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetCustomTypeAction(Function<MyShoppingListSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
