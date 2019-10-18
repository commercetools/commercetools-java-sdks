package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscount;
import com.commercetools.api.generated.models.cart_discount.CartDiscountPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscount> results;
   
   public CartDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscount> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscount> getResults(){
      return this.results;
   }

   public CartDiscountPagedQueryResponse build() {
       return new CartDiscountPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static CartDiscountPagedQueryResponseBuilder of() {
      return new CartDiscountPagedQueryResponseBuilder();
   }
   
   public static CartDiscountPagedQueryResponseBuilder of(final CartDiscountPagedQueryResponse template) {
      CartDiscountPagedQueryResponseBuilder builder = new CartDiscountPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}