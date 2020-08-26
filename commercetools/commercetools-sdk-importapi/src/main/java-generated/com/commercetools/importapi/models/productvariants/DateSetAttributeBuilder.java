package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalDate;
import com.commercetools.importapi.models.productvariants.DateSetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateSetAttributeBuilder {

    @Nullable
    private String name;
    
    
    private java.util.List<java.time.LocalDate> value;

    public DateSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public DateSetAttributeBuilder value( final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public java.util.List<java.time.LocalDate> getValue(){
        return this.value;
    }

    public DateSetAttribute build() {
        return new DateSetAttributeImpl(name, value);
    }

    public static DateSetAttributeBuilder of() {
        return new DateSetAttributeBuilder();
    }

    public static DateSetAttributeBuilder of(final DateSetAttribute template) {
        DateSetAttributeBuilder builder = new DateSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
