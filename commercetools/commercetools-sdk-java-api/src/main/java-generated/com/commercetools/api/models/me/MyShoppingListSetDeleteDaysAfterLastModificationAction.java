
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyShoppingListSetDeleteDaysAfterLastModificationAction extends MyShoppingListUpdateAction {

    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public static MyShoppingListSetDeleteDaysAfterLastModificationAction of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationAction of(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        MyShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        return MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetDeleteDaysAfterLastModificationAction(
            Function<MyShoppingListSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }
}
