package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerImpl implements MyCustomer {

   private String id;
   
   private Long version;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   private String customerNumber;
   
   private String email;
   
   private String password;
   
   private String firstName;
   
   private String lastName;
   
   private String middleName;
   
   private String title;
   
   private java.time.LocalDate dateOfBirth;
   
   private String companyName;
   
   private String vatId;
   
   private java.util.List<com.commercetools.api.models.common.Address> addresses;
   
   private String defaultShippingAddressId;
   
   private java.util.List<String> shippingAddressIds;
   
   private String defaultBillingAddressId;
   
   private java.util.List<String> billingAddressIds;
   
   private Boolean isEmailVerified;
   
   private String externalId;
   
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.api.models.type.CustomFields custom;
   
   private String locale;
   
   private String salutation;
   
   private String key;
   
   private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

   @JsonCreator
   MyCustomerImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("email") final String email, @JsonProperty("password") final String password, @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName, @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses, @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId, @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds, @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId, @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds, @JsonProperty("isEmailVerified") final Boolean isEmailVerified, @JsonProperty("externalId") final String externalId, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("locale") final String locale, @JsonProperty("salutation") final String salutation, @JsonProperty("key") final String key, @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
      this.id = id;
      this.version = version;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.lastModifiedBy = lastModifiedBy;
      this.createdBy = createdBy;
      this.customerNumber = customerNumber;
      this.email = email;
      this.password = password;
      this.firstName = firstName;
      this.lastName = lastName;
      this.middleName = middleName;
      this.title = title;
      this.dateOfBirth = dateOfBirth;
      this.companyName = companyName;
      this.vatId = vatId;
      this.addresses = addresses;
      this.defaultShippingAddressId = defaultShippingAddressId;
      this.shippingAddressIds = shippingAddressIds;
      this.defaultBillingAddressId = defaultBillingAddressId;
      this.billingAddressIds = billingAddressIds;
      this.isEmailVerified = isEmailVerified;
      this.externalId = externalId;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.locale = locale;
      this.salutation = salutation;
      this.key = key;
      this.stores = stores;
   }
   public MyCustomerImpl() {
      
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
   
   
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public String getEmail(){
      return this.email;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getLastName(){
      return this.lastName;
   }
   
   
   public String getMiddleName(){
      return this.middleName;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   
   public String getCompanyName(){
      return this.companyName;
   }
   
   
   public String getVatId(){
      return this.vatId;
   }
   
   
   public java.util.List<com.commercetools.api.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   
   public String getDefaultShippingAddressId(){
      return this.defaultShippingAddressId;
   }
   
   
   public java.util.List<String> getShippingAddressIds(){
      return this.shippingAddressIds;
   }
   
   
   public String getDefaultBillingAddressId(){
      return this.defaultBillingAddressId;
   }
   
   
   public java.util.List<String> getBillingAddressIds(){
      return this.billingAddressIds;
   }
   
   
   public Boolean getIsEmailVerified(){
      return this.isEmailVerified;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public String getSalutation(){
      return this.salutation;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores(){
      return this.stores;
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
   
   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }
   
   public void setPassword(final String password){
      this.password = password;
   }
   
   public void setFirstName(final String firstName){
      this.firstName = firstName;
   }
   
   public void setLastName(final String lastName){
      this.lastName = lastName;
   }
   
   public void setMiddleName(final String middleName){
      this.middleName = middleName;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }
   
   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }
   
   public void setVatId(final String vatId){
      this.vatId = vatId;
   }
   
   public void setAddresses(final java.util.List<com.commercetools.api.models.common.Address> addresses){
      this.addresses = addresses;
   }
   
   public void setDefaultShippingAddressId(final String defaultShippingAddressId){
      this.defaultShippingAddressId = defaultShippingAddressId;
   }
   
   public void setShippingAddressIds(final java.util.List<String> shippingAddressIds){
      this.shippingAddressIds = shippingAddressIds;
   }
   
   public void setDefaultBillingAddressId(final String defaultBillingAddressId){
      this.defaultBillingAddressId = defaultBillingAddressId;
   }
   
   public void setBillingAddressIds(final java.util.List<String> billingAddressIds){
      this.billingAddressIds = billingAddressIds;
   }
   
   public void setIsEmailVerified(final Boolean isEmailVerified){
      this.isEmailVerified = isEmailVerified;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setSalutation(final String salutation){
      this.salutation = salutation;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores){
      this.stores = stores;
   }

}
