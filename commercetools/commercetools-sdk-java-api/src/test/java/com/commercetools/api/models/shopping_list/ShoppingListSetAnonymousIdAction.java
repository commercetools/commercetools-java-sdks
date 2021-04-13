package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetAnonymousIdActionImpl.class)
public interface ShoppingListSetAnonymousIdAction extends ShoppingListUpdateAction {

    String SET_ANONYMOUS_ID = "setAnonymousId";

    /**
    *  <p>Anonymous ID of the anonymous customer that this shopping list belongs to.
    *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */
    
    @JsonProperty("anonymousId")
    public String getAnonymousId();

    
    public void setAnonymousId(final String anonymousId);
    

    public static ShoppingListSetAnonymousIdAction of(){
        return new ShoppingListSetAnonymousIdActionImpl();
    }
    

    public static ShoppingListSetAnonymousIdAction of(final ShoppingListSetAnonymousIdAction template) {
        ShoppingListSetAnonymousIdActionImpl instance = new ShoppingListSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static ShoppingListSetAnonymousIdActionBuilder builder(){
        return ShoppingListSetAnonymousIdActionBuilder.of();
    }
    
    public static ShoppingListSetAnonymousIdActionBuilder builder(final ShoppingListSetAnonymousIdAction template){
        return ShoppingListSetAnonymousIdActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetAnonymousIdAction(Function<ShoppingListSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }
}
