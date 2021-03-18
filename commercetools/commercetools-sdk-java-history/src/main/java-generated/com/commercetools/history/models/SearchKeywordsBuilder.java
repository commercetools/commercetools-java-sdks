
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordsBuilder {

    private Map<String, java.util.List<com.commercetools.history.models.SearchKeyword>> values;

    public SearchKeywordsBuilder values(
            final Map<String, java.util.List<com.commercetools.history.models.SearchKeyword>> values) {
        this.values = values;
        return this;
    }

    public SearchKeywordsBuilder addValue(final String key,
            final java.util.List<com.commercetools.history.models.SearchKeyword> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.util.List<com.commercetools.history.models.SearchKeyword>> getValues() {
        return this.values;
    }

    public SearchKeywords build() {
        return new SearchKeywordsImpl(values);
    }

    public static SearchKeywordsBuilder of() {
        return new SearchKeywordsBuilder();
    }

    public static SearchKeywordsBuilder of(final SearchKeywords template) {
        SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
        builder.values = template.values();
        return builder;
    }

}
