package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFields;
import java.time.LocalDate;
import com.commercetools.models.me.MyCustomer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private String lastName;
   
   
   private java.util.List<com.commercetools.models.common.Address> addresses;
   
   @Nullable
   private java.util.List<com.commercetools.models.store.StoreKeyReference> stores;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   @Nullable
   private String companyName;
   
   @Nullable
   private String vatId;
   
   @Nullable
   private String externalId;
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   @Nullable
   private String locale;
   
   @Nullable
   private java.util.List<String> billingAddressIds;
   
   @Nullable
   private String defaultShippingAddressId;
   
   @Nullable
   private String title;
   
   @Nullable
   private String customerNumber;
   
   
   private Boolean isEmailVerified;
   
   @Nullable
   private String defaultBillingAddressId;
   
   @Nullable
   private java.util.List<String> shippingAddressIds;
   
   @Nullable
   private String firstName;
   
   
   private String password;
   
   @Nullable
   private String middleName;
   
   @Nullable
   private String salutation;
   
   @Nullable
   private String key;
   
   
   private String email;
   
   public MyCustomerBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MyCustomerBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MyCustomerBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyCustomerBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public MyCustomerBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public MyCustomerBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public MyCustomerBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public MyCustomerBuilder addresses( final java.util.List<com.commercetools.models.common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }
   
   public MyCustomerBuilder stores(@Nullable final java.util.List<com.commercetools.models.store.StoreKeyReference> stores) {
      this.stores = stores;
      return this;
   }
   
   public MyCustomerBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MyCustomerBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyCustomerBuilder companyName(@Nullable final String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   public MyCustomerBuilder vatId(@Nullable final String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   public MyCustomerBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public MyCustomerBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   public MyCustomerBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyCustomerBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
      this.billingAddressIds = billingAddressIds;
      return this;
   }
   
   public MyCustomerBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
      this.defaultShippingAddressId = defaultShippingAddressId;
      return this;
   }
   
   public MyCustomerBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }
   
   public MyCustomerBuilder customerNumber(@Nullable final String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   public MyCustomerBuilder isEmailVerified( final Boolean isEmailVerified) {
      this.isEmailVerified = isEmailVerified;
      return this;
   }
   
   public MyCustomerBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
      this.defaultBillingAddressId = defaultBillingAddressId;
      return this;
   }
   
   public MyCustomerBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
      this.shippingAddressIds = shippingAddressIds;
      return this;
   }
   
   public MyCustomerBuilder firstName(@Nullable final String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public MyCustomerBuilder password( final String password) {
      this.password = password;
      return this;
   }
   
   public MyCustomerBuilder middleName(@Nullable final String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   public MyCustomerBuilder salutation(@Nullable final String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   public MyCustomerBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public MyCustomerBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public String getLastName(){
      return this.lastName;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.store.StoreKeyReference> getStores(){
      return this.stores;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public String getCompanyName(){
      return this.companyName;
   }
   
   @Nullable
   public String getVatId(){
      return this.vatId;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public java.util.List<String> getBillingAddressIds(){
      return this.billingAddressIds;
   }
   
   @Nullable
   public String getDefaultShippingAddressId(){
      return this.defaultShippingAddressId;
   }
   
   @Nullable
   public String getTitle(){
      return this.title;
   }
   
   @Nullable
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public Boolean getIsEmailVerified(){
      return this.isEmailVerified;
   }
   
   @Nullable
   public String getDefaultBillingAddressId(){
      return this.defaultBillingAddressId;
   }
   
   @Nullable
   public java.util.List<String> getShippingAddressIds(){
      return this.shippingAddressIds;
   }
   
   @Nullable
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   @Nullable
   public String getMiddleName(){
      return this.middleName;
   }
   
   @Nullable
   public String getSalutation(){
      return this.salutation;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public MyCustomer build() {
       return new MyCustomerImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, lastName, addresses, stores, customerGroup, custom, companyName, vatId, externalId, dateOfBirth, locale, billingAddressIds, defaultShippingAddressId, title, customerNumber, isEmailVerified, defaultBillingAddressId, shippingAddressIds, firstName, password, middleName, salutation, key, email);
   }
   
   public static MyCustomerBuilder of() {
      return new MyCustomerBuilder();
   }
   
   public static MyCustomerBuilder of(final MyCustomer template) {
      MyCustomerBuilder builder = new MyCustomerBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.lastName = template.getLastName();
      builder.addresses = template.getAddresses();
      builder.stores = template.getStores();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.companyName = template.getCompanyName();
      builder.vatId = template.getVatId();
      builder.externalId = template.getExternalId();
      builder.dateOfBirth = template.getDateOfBirth();
      builder.locale = template.getLocale();
      builder.billingAddressIds = template.getBillingAddressIds();
      builder.defaultShippingAddressId = template.getDefaultShippingAddressId();
      builder.title = template.getTitle();
      builder.customerNumber = template.getCustomerNumber();
      builder.isEmailVerified = template.getIsEmailVerified();
      builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
      builder.shippingAddressIds = template.getShippingAddressIds();
      builder.firstName = template.getFirstName();
      builder.password = template.getPassword();
      builder.middleName = template.getMiddleName();
      builder.salutation = template.getSalutation();
      builder.key = template.getKey();
      builder.email = template.getEmail();
      return builder;
   }
   
}