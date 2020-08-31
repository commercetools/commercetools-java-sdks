package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.EnumField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class EnumFieldBuilder {

    
    private String value;

    public EnumFieldBuilder value( final String value) {
        this.value = value;
        return this;
    }

    
    public String getValue(){
        return this.value;
    }

    public EnumField build() {
        return new EnumFieldImpl(value);
    }

    public static EnumFieldBuilder of() {
        return new EnumFieldBuilder();
    }

    public static EnumFieldBuilder of(final EnumField template) {
        EnumFieldBuilder builder = new EnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
