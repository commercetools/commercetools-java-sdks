package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order_edit.OrderEditApplied;
import com.commercetools.models.order_edit.OrderEditReference;
import java.lang.String;
import com.commercetools.models.message.OrderEditAppliedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditAppliedMessagePayloadBuilder {
   
   
   private com.commercetools.models.order_edit.OrderEditApplied result;
   
   
   private com.commercetools.models.order_edit.OrderEditReference edit;
   
   public OrderEditAppliedMessagePayloadBuilder result( final com.commercetools.models.order_edit.OrderEditApplied result) {
      this.result = result;
      return this;
   }
   
   public OrderEditAppliedMessagePayloadBuilder edit( final com.commercetools.models.order_edit.OrderEditReference edit) {
      this.edit = edit;
      return this;
   }
   
   
   public com.commercetools.models.order_edit.OrderEditApplied getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.order_edit.OrderEditReference getEdit(){
      return this.edit;
   }

   public OrderEditAppliedMessagePayload build() {
       return new OrderEditAppliedMessagePayloadImpl(result, edit);
   }
   
   public static OrderEditAppliedMessagePayloadBuilder of() {
      return new OrderEditAppliedMessagePayloadBuilder();
   }
   
   public static OrderEditAppliedMessagePayloadBuilder of(final OrderEditAppliedMessagePayload template) {
      OrderEditAppliedMessagePayloadBuilder builder = new OrderEditAppliedMessagePayloadBuilder();
      builder.result = template.getResult();
      builder.edit = template.getEdit();
      return builder;
   }
   
}