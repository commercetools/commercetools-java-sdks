package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeSetTypeBuilder {

    
    private com.commercetools.api.models.product_type.AttributeType elementType;

    public AttributeSetTypeBuilder elementType( final com.commercetools.api.models.product_type.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    
    public com.commercetools.api.models.product_type.AttributeType getElementType(){
        return this.elementType;
    }

    public AttributeSetType build() {
        return new AttributeSetTypeImpl(elementType);
    }

    public static AttributeSetTypeBuilder of() {
        return new AttributeSetTypeBuilder();
    }

    public static AttributeSetTypeBuilder of(final AttributeSetType template) {
        AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
