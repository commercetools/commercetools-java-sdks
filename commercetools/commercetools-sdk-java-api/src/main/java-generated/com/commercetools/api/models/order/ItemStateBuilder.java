package com.commercetools.api.models.order;

import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.order.ItemState;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemStateBuilder {

    
    private Double quantity;
    
    
    private com.commercetools.api.models.state.StateReference state;

    public ItemStateBuilder quantity( final Double quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public ItemStateBuilder state( final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    
    public Double getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }

    public ItemState build() {
        return new ItemStateImpl(quantity, state);
    }

    public static ItemStateBuilder of() {
        return new ItemStateBuilder();
    }

    public static ItemStateBuilder of(final ItemState template) {
        ItemStateBuilder builder = new ItemStateBuilder();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        return builder;
    }

}
