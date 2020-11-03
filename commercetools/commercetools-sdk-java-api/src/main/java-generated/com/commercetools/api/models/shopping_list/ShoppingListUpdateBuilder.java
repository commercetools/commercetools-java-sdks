package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListUpdateBuilder {

    
    private Long version;
    
    
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions;

    public ShoppingListUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public ShoppingListUpdateBuilder actions( final com.commercetools.api.models.shopping_list.ShoppingListUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    public ShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> getActions(){
        return this.actions;
    }

    public ShoppingListUpdate build() {
        return new ShoppingListUpdateImpl(version, actions);
    }

    public static ShoppingListUpdateBuilder of() {
        return new ShoppingListUpdateBuilder();
    }

    public static ShoppingListUpdateBuilder of(final ShoppingListUpdate template) {
        ShoppingListUpdateBuilder builder = new ShoppingListUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
