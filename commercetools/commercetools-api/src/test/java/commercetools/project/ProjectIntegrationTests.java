package commercetools.project;

import com.commercetools.models.project.Project;
import com.commercetools.models.project.ProjectChangeCountriesActionBuilder;
import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ProjectUpdateBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectIntegrationTests {
    
    @Test
    public void byKeyGet() throws Exception {
        String projectKey = CommercetoolsTestUtils.getProjectKey();
        Project project = CommercetoolsTestUtils.getApiRoot().withProjectKey(projectKey)
                .get()
                .executeBlocking().getBody();
        Assertions.assertNotNull(project);
        Assertions.assertEquals(projectKey, project.getKey());
    }
    
    @Test
    public void updateProject() throws Exception {
        List<String> countries = Arrays.asList("DE");
        List<ProjectUpdateAction> updateActions = new ArrayList<>();
        updateActions.add(ProjectChangeCountriesActionBuilder.of().countries(countries).build());
        Project project = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .post(ProjectUpdateBuilder.of().actions(updateActions).build())
                .executeBlocking().getBody();
        System.out.println(project.getCountries());
    }
    
}
