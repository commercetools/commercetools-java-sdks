package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.LocalDate;
import com.commercetools.api.models.customer.CustomerDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerDraftImpl.class)
public interface CustomerDraft  {

    /**
    *  <p>String that uniquely identifies a customer.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the customer.
    *  It should be <strong>unique</strong> across a project.
    *  Once it's set it cannot be changed.</p>
    */
    
    @JsonProperty("customerNumber")
    public String getCustomerNumber();
    /**
    *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
    *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project, and are case insensitive.
    *  For more information, see Email uniquenes.</p>
    */
    @NotNull
    @JsonProperty("email")
    public String getEmail();
    
    @NotNull
    @JsonProperty("password")
    public String getPassword();
    
    
    @JsonProperty("firstName")
    public String getFirstName();
    
    
    @JsonProperty("lastName")
    public String getLastName();
    
    
    @JsonProperty("middleName")
    public String getMiddleName();
    
    
    @JsonProperty("title")
    public String getTitle();
    /**
    *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
    */
    
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();
    /**
    *  <p>Identifies carts and orders belonging to an anonymous session that will be assigned to the new customer account.</p>
    */
    
    @JsonProperty("anonymousId")
    public String getAnonymousId();
    
    
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();
    
    
    @JsonProperty("companyName")
    public String getCompanyName();
    
    
    @JsonProperty("vatId")
    public String getVatId();
    /**
    *  <p>Sets the ID of each address to be unique in the addresses list.</p>
    */
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();
    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    
    @JsonProperty("defaultShippingAddress")
    public Long getDefaultShippingAddress();
    /**
    *  <p>The indices of the shipping addresses in the addresses array.
    *  The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
    */
    
    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();
    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    
    @JsonProperty("defaultBillingAddress")
    public Long getDefaultBillingAddress();
    /**
    *  <p>The indices of the billing addresses in the addresses array.
    *  The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */
    
    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();
    
    
    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();
    
    
    @JsonProperty("externalId")
    public String getExternalId();
    
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();
    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    /**
    *  <p>Must be one of the languages supported for this project</p>
    */
    
    @JsonProperty("locale")
    public String getLocale();
    
    
    @JsonProperty("salutation")
    public String getSalutation();
    /**
    *  <p>User-specific unique identifier for a customer.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction</p>
    */
    
    @JsonProperty("key")
    public String getKey();
    /**
    *  <p>References to the stores the customer account is associated with.
    *  If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers.
    *  If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
    */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    public void setCustomerNumber(final String customerNumber);
    
    public void setEmail(final String email);
    
    public void setPassword(final String password);
    
    public void setFirstName(final String firstName);
    
    public void setLastName(final String lastName);
    
    public void setMiddleName(final String middleName);
    
    public void setTitle(final String title);
    
    public void setAnonymousCartId(final String anonymousCartId);
    
    public void setAnonymousId(final String anonymousId);
    
    public void setDateOfBirth(final LocalDate dateOfBirth);
    
    public void setCompanyName(final String companyName);
    
    public void setVatId(final String vatId);
    
    public void setAddresses(final List<Address> addresses);
    
    public void setDefaultShippingAddress(final Long defaultShippingAddress);
    
    public void setShippingAddresses(final List<Integer> shippingAddresses);
    
    public void setDefaultBillingAddress(final Long defaultBillingAddress);
    
    public void setBillingAddresses(final List<Integer> billingAddresses);
    
    public void setIsEmailVerified(final Boolean isEmailVerified);
    
    public void setExternalId(final String externalId);
    
    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setLocale(final String locale);
    
    public void setSalutation(final String salutation);
    
    public void setKey(final String key);
    
    public void setStores(final List<StoreResourceIdentifier> stores);

    public static CustomerDraftImpl of(){
        return new CustomerDraftImpl();
    }
    

    public static CustomerDraftImpl of(final CustomerDraft template) {
        CustomerDraftImpl instance = new CustomerDraftImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setAnonymousCartId(template.getAnonymousCartId());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(template.getAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setIsEmailVerified(template.getIsEmailVerified());
        instance.setExternalId(template.getExternalId());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setKey(template.getKey());
        instance.setStores(template.getStores());
        return instance;
    }

}
