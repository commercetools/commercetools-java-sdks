package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SemanticErrorError;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SemanticErrorErrorBuilder {

    
    
    private String message;

    
    public SemanticErrorErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    
    public String getMessage(){
        return this.message;
    }

    public SemanticErrorError build() {
        return new SemanticErrorErrorImpl(message);
    }

    public static SemanticErrorErrorBuilder of() {
        return new SemanticErrorErrorBuilder();
    }

    public static SemanticErrorErrorBuilder of(final SemanticErrorError template) {
        SemanticErrorErrorBuilder builder = new SemanticErrorErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
