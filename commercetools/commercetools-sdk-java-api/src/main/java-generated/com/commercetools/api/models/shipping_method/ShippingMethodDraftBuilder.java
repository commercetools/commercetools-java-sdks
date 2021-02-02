
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodDraftBuilder {

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates;

    private Boolean isDefault;

    @Nullable
    private String predicate;

    public ShippingMethodDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ShippingMethodDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShippingMethodDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public ShippingMethodDraftBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    public ShippingMethodDraftBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingMethodDraftBuilder zoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
        return this;
    }

    public ShippingMethodDraftBuilder zoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates) {
        this.zoneRates = zoneRates;
        return this;
    }

    public ShippingMethodDraftBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public ShippingMethodDraftBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> getZoneRates() {
        return this.zoneRates;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    public ShippingMethodDraft build() {
        return new ShippingMethodDraftImpl(key, name, description, localizedDescription, taxCategory, zoneRates,
            isDefault, predicate);
    }

    public static ShippingMethodDraftBuilder of() {
        return new ShippingMethodDraftBuilder();
    }

    public static ShippingMethodDraftBuilder of(final ShippingMethodDraft template) {
        ShippingMethodDraftBuilder builder = new ShippingMethodDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.localizedDescription = template.getLocalizedDescription();
        builder.taxCategory = template.getTaxCategory();
        builder.zoneRates = template.getZoneRates();
        builder.isDefault = template.getIsDefault();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
