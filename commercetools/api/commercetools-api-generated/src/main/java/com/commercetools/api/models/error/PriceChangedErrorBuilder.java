package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.PriceChangedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceChangedErrorBuilder {
   
   
   private String message;
   
   
   private java.util.List<String> lineItems;
   
   
   private Boolean shipping;
   
   public PriceChangedErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public PriceChangedErrorBuilder lineItems( final java.util.List<String> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public PriceChangedErrorBuilder shipping( final Boolean shipping) {
      this.shipping = shipping;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<String> getLineItems(){
      return this.lineItems;
   }
   
   
   public Boolean getShipping(){
      return this.shipping;
   }

   public PriceChangedError build() {
       return new PriceChangedErrorImpl(message, lineItems, shipping);
   }
   
   public static PriceChangedErrorBuilder of() {
      return new PriceChangedErrorBuilder();
   }
   
   public static PriceChangedErrorBuilder of(final PriceChangedError template) {
      PriceChangedErrorBuilder builder = new PriceChangedErrorBuilder();
      builder.message = template.getMessage();
      builder.lineItems = template.getLineItems();
      builder.shipping = template.getShipping();
      return builder;
   }
   
}
