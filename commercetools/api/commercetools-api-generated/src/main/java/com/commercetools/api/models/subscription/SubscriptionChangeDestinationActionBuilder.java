package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionChangeDestinationActionBuilder {


   private com.commercetools.api.models.subscription.Destination destination;

   public SubscriptionChangeDestinationActionBuilder destination( final com.commercetools.api.models.subscription.Destination destination) {
      this.destination = destination;
      return this;
   }


   public com.commercetools.api.models.subscription.Destination getDestination(){
      return this.destination;
   }

   public SubscriptionChangeDestinationAction build() {
       return new SubscriptionChangeDestinationActionImpl(destination);
   }

   public static SubscriptionChangeDestinationActionBuilder of() {
      return new SubscriptionChangeDestinationActionBuilder();
   }

   public static SubscriptionChangeDestinationActionBuilder of(final SubscriptionChangeDestinationAction template) {
      SubscriptionChangeDestinationActionBuilder builder = new SubscriptionChangeDestinationActionBuilder();
      builder.destination = template.getDestination();
      return builder;
   }

}
