package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetTitleActionBuilder {

    @Nullable
    private String title;

    public MyCustomerSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getTitle(){
        return this.title;
    }

    public MyCustomerSetTitleAction build() {
        return new MyCustomerSetTitleActionImpl(title);
    }

    public static MyCustomerSetTitleActionBuilder of() {
        return new MyCustomerSetTitleActionBuilder();
    }

    public static MyCustomerSetTitleActionBuilder of(final MyCustomerSetTitleAction template) {
        MyCustomerSetTitleActionBuilder builder = new MyCustomerSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
