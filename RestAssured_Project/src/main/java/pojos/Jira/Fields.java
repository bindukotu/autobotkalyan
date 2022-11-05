package pojos.Jira;

import java.util.Date;
import java.util.List;

public class Fields {
    private Project project;
    private String summary;
    private IssueType issuetype;
    private String customfield_10015;
    private String duedate;
    private String description;
    private Assignee assignee;
    private Reporter reporter;
    private List<String> labels;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public IssueType getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(IssueType issuetype) {
        this.issuetype = issuetype;
    }

    public String getCustomfield_10015() {
        return customfield_10015;
    }

    public void setCustomfield_10015(String customfield_10015) {
        this.customfield_10015 = customfield_10015;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
