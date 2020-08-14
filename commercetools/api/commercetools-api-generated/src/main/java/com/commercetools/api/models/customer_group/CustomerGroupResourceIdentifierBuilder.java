package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupResourceIdentifierBuilder {

    @Nullable
    private String id;
    
    @Nullable
    private String key;

    public CustomerGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    public CustomerGroupResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId(){
        return this.id;
    }
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    public CustomerGroupResourceIdentifier build() {
        return new CustomerGroupResourceIdentifierImpl(id, key);
    }

    public static CustomerGroupResourceIdentifierBuilder of() {
        return new CustomerGroupResourceIdentifierBuilder();
    }

    public static CustomerGroupResourceIdentifierBuilder of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierBuilder builder = new CustomerGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
