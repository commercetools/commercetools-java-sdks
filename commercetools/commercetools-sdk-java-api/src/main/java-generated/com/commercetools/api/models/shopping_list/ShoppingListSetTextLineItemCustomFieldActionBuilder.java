package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetTextLineItemCustomFieldActionBuilder {

    
    
    private String textLineItemId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }
    
    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public ShoppingListSetTextLineItemCustomFieldAction build() {
        return new ShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of(final ShoppingListSetTextLineItemCustomFieldAction template) {
        ShoppingListSetTextLineItemCustomFieldActionBuilder builder = new ShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
