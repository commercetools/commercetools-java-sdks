package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelAddedToDeliveryMessageBuilder {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    private Long sequenceNumber;
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    private Long resourceVersion;
    
    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    private com.commercetools.api.models.order.Delivery delivery;
    
    
    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelAddedToDeliveryMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder delivery( final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }
    
    public ParcelAddedToDeliveryMessageBuilder parcel( final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
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
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    
    public com.commercetools.api.models.order.Delivery getDelivery(){
        return this.delivery;
    }
    
    
    public com.commercetools.api.models.order.Parcel getParcel(){
        return this.parcel;
    }

    public ParcelAddedToDeliveryMessage build() {
        return new ParcelAddedToDeliveryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, delivery, parcel);
    }

    public static ParcelAddedToDeliveryMessageBuilder of() {
        return new ParcelAddedToDeliveryMessageBuilder();
    }

    public static ParcelAddedToDeliveryMessageBuilder of(final ParcelAddedToDeliveryMessage template) {
        ParcelAddedToDeliveryMessageBuilder builder = new ParcelAddedToDeliveryMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.delivery = template.getDelivery();
        builder.parcel = template.getParcel();
        return builder;
    }

}
