package com.commercetools.models.order_edit;


import com.commercetools.models.order_edit.OrderEditApply;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditApplyBuilder {
   
   
   private Integer resourceVersion;
   
   
   private Integer editVersion;
   
   public OrderEditApplyBuilder resourceVersion( final Integer resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderEditApplyBuilder editVersion( final Integer editVersion) {
      this.editVersion = editVersion;
      return this;
   }
   
   
   public Integer getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public Integer getEditVersion(){
      return this.editVersion;
   }

   public OrderEditApply build() {
       return new OrderEditApplyImpl(resourceVersion, editVersion);
   }
   
   public static OrderEditApplyBuilder of() {
      return new OrderEditApplyBuilder();
   }
   
   public static OrderEditApplyBuilder of(final OrderEditApply template) {
      OrderEditApplyBuilder builder = new OrderEditApplyBuilder();
      builder.resourceVersion = template.getResourceVersion();
      builder.editVersion = template.getEditVersion();
      return builder;
   }
   
}