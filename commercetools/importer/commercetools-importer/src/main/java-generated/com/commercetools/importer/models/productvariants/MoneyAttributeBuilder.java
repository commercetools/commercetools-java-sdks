package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.TypedMoney;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.MoneyAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneyAttributeBuilder {

    @Nullable
    private String name;
    
    
    private com.commercetools.importer.models.common.TypedMoney value;

    public MoneyAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public MoneyAttributeBuilder value( final com.commercetools.importer.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.importer.models.common.TypedMoney getValue(){
        return this.value;
    }

    public MoneyAttribute build() {
        return new MoneyAttributeImpl(name, value);
    }

    public static MoneyAttributeBuilder of() {
        return new MoneyAttributeBuilder();
    }

    public static MoneyAttributeBuilder of(final MoneyAttribute template) {
        MoneyAttributeBuilder builder = new MoneyAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
