package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidCurrentPasswordError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidCurrentPasswordErrorBuilder {
   
   
   private String message;
   
   public InvalidCurrentPasswordErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public InvalidCurrentPasswordError build() {
       return new InvalidCurrentPasswordErrorImpl(message);
   }
   
   public static InvalidCurrentPasswordErrorBuilder of() {
      return new InvalidCurrentPasswordErrorBuilder();
   }
   
   public static InvalidCurrentPasswordErrorBuilder of(final InvalidCurrentPasswordError template) {
      InvalidCurrentPasswordErrorBuilder builder = new InvalidCurrentPasswordErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}