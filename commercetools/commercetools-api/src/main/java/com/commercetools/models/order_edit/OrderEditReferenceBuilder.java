package com.commercetools.models.order_edit;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.order_edit.OrderEdit;
import com.commercetools.models.order_edit.OrderEditReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.models.order_edit.OrderEdit obj;
   
   public OrderEditReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public OrderEditReferenceBuilder obj(@Nullable final com.commercetools.models.order_edit.OrderEdit obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.order_edit.OrderEdit getObj(){
      return this.obj;
   }

   public OrderEditReference build() {
       return new OrderEditReferenceImpl(id, obj);
   }
   
   public static OrderEditReferenceBuilder of() {
      return new OrderEditReferenceBuilder();
   }
   
   public static OrderEditReferenceBuilder of(final OrderEditReference template) {
      OrderEditReferenceBuilder builder = new OrderEditReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}