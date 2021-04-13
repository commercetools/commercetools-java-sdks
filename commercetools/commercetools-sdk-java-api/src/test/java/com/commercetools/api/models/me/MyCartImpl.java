package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartState;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartImpl implements MyCart {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    private String key;
    
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    private String customerId;
    
    
    private String customerEmail;
    
    
    private String anonymousId;
    
    
    private com.commercetools.api.models.store.StoreKeyReference store;
    
    
    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;
    
    
    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;
    
    
    private com.commercetools.api.models.common.TypedMoney totalPrice;
    
    
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;
    
    
    private com.commercetools.api.models.cart.CartState cartState;
    
    
    private com.commercetools.api.models.common.Address shippingAddress;
    
    
    private com.commercetools.api.models.common.Address billingAddress;
    
    
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;
    
    
    private com.commercetools.api.models.cart.TaxMode taxMode;
    
    
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;
    
    
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;
    
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    
    private String country;
    
    
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;
    
    
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;
    
    
    private com.commercetools.api.models.type.CustomFields custom;
    
    
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;
    
    
    private String locale;
    
    
    private Integer deleteDaysAfterLastModification;
    
    
    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;
    
    
    private com.commercetools.api.models.cart.CartOrigin origin;
    
    
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;
    
    
    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    @JsonCreator
    MyCartImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("key") final String key, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("customerId") final String customerId, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems, @JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice, @JsonProperty("cartState") final com.commercetools.api.models.cart.CartState cartState, @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress, @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode, @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode, @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode, @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("country") final String country, @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo, @JsonProperty("discountCodes") final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("paymentInfo") final com.commercetools.api.models.order.PaymentInfo paymentInfo, @JsonProperty("locale") final String locale, @JsonProperty("deleteDaysAfterLastModification") final Integer deleteDaysAfterLastModification, @JsonProperty("refusedGifts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts, @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin, @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.anonymousId = anonymousId;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.cartState = cartState;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.inventoryMode = inventoryMode;
        this.taxMode = taxMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.customerGroup = customerGroup;
        this.country = country;
        this.shippingInfo = shippingInfo;
        this.discountCodes = discountCodes;
        this.custom = custom;
        this.paymentInfo = paymentInfo;
        this.locale = locale;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.refusedGifts = refusedGifts;
        this.origin = origin;
        this.shippingRateInput = shippingRateInput;
        this.itemShippingAddresses = itemShippingAddresses;
    }
    public MyCartImpl() {
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public String getCustomerId(){
        return this.customerId;
    }
    
    
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    
    
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    
    public com.commercetools.api.models.store.StoreKeyReference getStore(){
        return this.store;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems(){
        return this.lineItems;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems(){
        return this.customLineItems;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
        return this.totalPrice;
    }
    
    
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice(){
        return this.taxedPrice;
    }
    
    
    public com.commercetools.api.models.cart.CartState getCartState(){
        return this.cartState;
    }
    
    
    public com.commercetools.api.models.common.Address getShippingAddress(){
        return this.shippingAddress;
    }
    
    
    public com.commercetools.api.models.common.Address getBillingAddress(){
        return this.billingAddress;
    }
    
    
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode(){
        return this.inventoryMode;
    }
    
    
    public com.commercetools.api.models.cart.TaxMode getTaxMode(){
        return this.taxMode;
    }
    
    
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
        return this.taxRoundingMode;
    }
    
    
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
        return this.taxCalculationMode;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo(){
        return this.shippingInfo;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes(){
        return this.discountCodes;
    }
    
    
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo(){
        return this.paymentInfo;
    }
    
    
    public String getLocale(){
        return this.locale;
    }
    
    
    public Integer getDeleteDaysAfterLastModification(){
        return this.deleteDaysAfterLastModification;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts(){
        return this.refusedGifts;
    }
    
    
    public com.commercetools.api.models.cart.CartOrigin getOrigin(){
        return this.origin;
    }
    
    
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput(){
        return this.shippingRateInput;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses(){
        return this.itemShippingAddresses;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    
    public void setCustomerId(final String customerId){
        this.customerId = customerId;
    }
    
    
    public void setCustomerEmail(final String customerEmail){
        this.customerEmail = customerEmail;
    }
    
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }
    
    
    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store){
        this.store = store;
    }
    
    
    public void setLineItems(final com.commercetools.api.models.cart.LineItem ...lineItems){
       this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }
    
    
    public void setLineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems){
       this.lineItems = lineItems;
    }
    
    
    public void setCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem ...customLineItems){
       this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }
    
    
    public void setCustomLineItems(final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems){
       this.customLineItems = customLineItems;
    }
    
    
    public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice){
        this.totalPrice = totalPrice;
    }
    
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }
    
    
    public void setCartState(final com.commercetools.api.models.cart.CartState cartState){
        this.cartState = cartState;
    }
    
    
    public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress){
        this.shippingAddress = shippingAddress;
    }
    
    
    public void setBillingAddress(final com.commercetools.api.models.common.Address billingAddress){
        this.billingAddress = billingAddress;
    }
    
    
    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode){
        this.inventoryMode = inventoryMode;
    }
    
    
    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode){
        this.taxMode = taxMode;
    }
    
    
    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode){
        this.taxRoundingMode = taxRoundingMode;
    }
    
    
    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode){
        this.taxCalculationMode = taxCalculationMode;
    }
    
    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    
    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo){
        this.shippingInfo = shippingInfo;
    }
    
    
    public void setDiscountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo ...discountCodes){
       this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
    }
    
    
    public void setDiscountCodes(final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes){
       this.discountCodes = discountCodes;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }
    
    
    public void setPaymentInfo(final com.commercetools.api.models.order.PaymentInfo paymentInfo){
        this.paymentInfo = paymentInfo;
    }
    
    
    public void setLocale(final String locale){
        this.locale = locale;
    }
    
    
    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification){
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }
    
    
    public void setRefusedGifts(final com.commercetools.api.models.cart_discount.CartDiscountReference ...refusedGifts){
       this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
    }
    
    
    public void setRefusedGifts(final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts){
       this.refusedGifts = refusedGifts;
    }
    
    
    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin){
        this.origin = origin;
    }
    
    
    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput){
        this.shippingRateInput = shippingRateInput;
    }
    
    
    public void setItemShippingAddresses(final com.commercetools.api.models.common.Address ...itemShippingAddresses){
       this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }
    
    
    public void setItemShippingAddresses(final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses){
       this.itemShippingAddresses = itemShippingAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartImpl that = (MyCartImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(anonymousId, that.anonymousId)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(cartState, that.cartState)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(inventoryMode, that.inventoryMode)
                .append(taxMode, that.taxMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(customerGroup, that.customerGroup)
                .append(country, that.country)
                .append(shippingInfo, that.shippingInfo)
                .append(discountCodes, that.discountCodes)
                .append(custom, that.custom)
                .append(paymentInfo, that.paymentInfo)
                .append(locale, that.locale)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(refusedGifts, that.refusedGifts)
                .append(origin, that.origin)
                .append(shippingRateInput, that.shippingRateInput)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .append(createdAt)
            .append(lastModifiedAt)
            .append(key)
            .append(lastModifiedBy)
            .append(createdBy)
            .append(customerId)
            .append(customerEmail)
            .append(anonymousId)
            .append(store)
            .append(lineItems)
            .append(customLineItems)
            .append(totalPrice)
            .append(taxedPrice)
            .append(cartState)
            .append(shippingAddress)
            .append(billingAddress)
            .append(inventoryMode)
            .append(taxMode)
            .append(taxRoundingMode)
            .append(taxCalculationMode)
            .append(customerGroup)
            .append(country)
            .append(shippingInfo)
            .append(discountCodes)
            .append(custom)
            .append(paymentInfo)
            .append(locale)
            .append(deleteDaysAfterLastModification)
            .append(refusedGifts)
            .append(origin)
            .append(shippingRateInput)
            .append(itemShippingAddresses)
            .toHashCode();
    }

}
