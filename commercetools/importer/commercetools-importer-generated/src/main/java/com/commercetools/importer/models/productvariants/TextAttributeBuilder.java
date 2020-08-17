package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.TextAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TextAttributeBuilder {

    @Nullable
    private String name;
    
    
    private String value;

    public TextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public TextAttributeBuilder value( final String value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public String getValue(){
        return this.value;
    }

    public TextAttribute build() {
        return new TextAttributeImpl(name, value);
    }

    public static TextAttributeBuilder of() {
        return new TextAttributeBuilder();
    }

    public static TextAttributeBuilder of(final TextAttribute template) {
        TextAttributeBuilder builder = new TextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
