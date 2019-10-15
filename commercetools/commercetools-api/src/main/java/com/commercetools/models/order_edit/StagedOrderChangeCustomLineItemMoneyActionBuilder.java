package com.commercetools.models.order_edit;

import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeCustomLineItemMoneyActionBuilder {
   
   
   private String customLineItemId;
   
   
   private com.commercetools.models.common.Money money;
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.common.Money getMoney(){
      return this.money;
   }

   public StagedOrderChangeCustomLineItemMoneyAction build() {
       return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
   }
   
   public static StagedOrderChangeCustomLineItemMoneyActionBuilder of() {
      return new StagedOrderChangeCustomLineItemMoneyActionBuilder();
   }
   
   public static StagedOrderChangeCustomLineItemMoneyActionBuilder of(final StagedOrderChangeCustomLineItemMoneyAction template) {
      StagedOrderChangeCustomLineItemMoneyActionBuilder builder = new StagedOrderChangeCustomLineItemMoneyActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.money = template.getMoney();
      return builder;
   }
   
}