package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeLanguagesActionBuilder {

    
    private java.util.List<String> languages;

    public ProjectChangeLanguagesActionBuilder languages( final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    public ProjectChangeLanguagesAction build() {
        return new ProjectChangeLanguagesActionImpl(languages);
    }

    public static ProjectChangeLanguagesActionBuilder of() {
        return new ProjectChangeLanguagesActionBuilder();
    }

    public static ProjectChangeLanguagesActionBuilder of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionBuilder builder = new ProjectChangeLanguagesActionBuilder();
        builder.languages = template.getLanguages();
        return builder;
    }

}
