package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.ItemShippingDetails;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.order.ItemState;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.tax_category.TaxRate;
import com.commercetools.models.type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart.CustomLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomLineItemBuilder {
   
   @Nullable
   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetails shippingDetails;
   
   
   private com.commercetools.models.common.TypedMoney money;
   
   
   private com.commercetools.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   
   private java.lang.String id;
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   
   private java.lang.String slug;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;
   
   public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public CustomLineItemBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CustomLineItemBuilder money( final com.commercetools.models.common.TypedMoney money) {
      this.money = money;
      return this;
   }
   
   public CustomLineItemBuilder totalPrice( final com.commercetools.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public CustomLineItemBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public CustomLineItemBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomLineItemBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CustomLineItemBuilder state( final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public CustomLineItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   public CustomLineItemBuilder slug( final java.lang.String slug) {
      this.slug = slug;
      return this;
   }
   
   public CustomLineItemBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.common.TypedMoney getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public CustomLineItem build() {
       return new CustomLineItemImpl(taxRate, quantity, shippingDetails, money, totalPrice, taxedPrice, custom, name, state, id, discountedPricePerQuantity, slug, taxCategory);
   }
   
   public static CustomLineItemBuilder of() {
      return new CustomLineItemBuilder();
   }
   
   public static CustomLineItemBuilder of(final CustomLineItem template) {
      CustomLineItemBuilder builder = new CustomLineItemBuilder();
      builder.taxRate = template.getTaxRate();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.money = template.getMoney();
      builder.totalPrice = template.getTotalPrice();
      builder.taxedPrice = template.getTaxedPrice();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
      builder.slug = template.getSlug();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}