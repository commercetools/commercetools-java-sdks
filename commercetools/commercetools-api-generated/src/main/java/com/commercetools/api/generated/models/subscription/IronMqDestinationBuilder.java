package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.IronMqDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class IronMqDestinationBuilder {
   
   
   private String uri;
   
   public IronMqDestinationBuilder uri( final String uri) {
      this.uri = uri;
      return this;
   }
   
   
   public String getUri(){
      return this.uri;
   }

   public IronMqDestination build() {
       return new IronMqDestinationImpl(uri);
   }
   
   public static IronMqDestinationBuilder of() {
      return new IronMqDestinationBuilder();
   }
   
   public static IronMqDestinationBuilder of(final IronMqDestination template) {
      IronMqDestinationBuilder builder = new IronMqDestinationBuilder();
      builder.uri = template.getUri();
      return builder;
   }
   
}