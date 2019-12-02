package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.ContentionError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ContentionErrorBuilder {
   
   
   private String message;
   
   public ContentionErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public ContentionError build() {
       return new ContentionErrorImpl(message);
   }
   
   public static ContentionErrorBuilder of() {
      return new ContentionErrorBuilder();
   }
   
   public static ContentionErrorBuilder of(final ContentionError template) {
      ContentionErrorBuilder builder = new ContentionErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}