package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class PriceDraftImpl implements PriceDraft {

    private com.commercetools.api.models.common.Money value;
    
    private String country;
    
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;
    
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @JsonCreator
    PriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value, @JsonProperty("country") final String country, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers, @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.custom = custom;
        this.tiers = tiers;
        this.discounted = discounted;
    }
    public PriceDraftImpl() {
       
    }

    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel(){
        return this.channel;
    }
    
    
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers(){
        return this.tiers;
    }
    
    
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }

    public void setValue(final com.commercetools.api.models.common.Money value){
        this.value = value;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel){
        this.channel = channel;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers){
        this.tiers = tiers;
    }
    
    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }

}
