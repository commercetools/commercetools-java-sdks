package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetDeliveryItemsActionBuilder {
   
   
   private String deliveryId;
   
   
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
   
   public StagedOrderSetDeliveryItemsActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public StagedOrderSetDeliveryItemsActionBuilder items( final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public StagedOrderSetDeliveryItemsAction build() {
       return new StagedOrderSetDeliveryItemsActionImpl(deliveryId, items);
   }
   
   public static StagedOrderSetDeliveryItemsActionBuilder of() {
      return new StagedOrderSetDeliveryItemsActionBuilder();
   }
   
   public static StagedOrderSetDeliveryItemsActionBuilder of(final StagedOrderSetDeliveryItemsAction template) {
      StagedOrderSetDeliveryItemsActionBuilder builder = new StagedOrderSetDeliveryItemsActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      return builder;
   }
   
}
