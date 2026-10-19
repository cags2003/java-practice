public class Application {
    private String companyName;
    private String jobTitle;

    public Application(String companyName, String jobTitle) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty()) {
            throw new IllegalArgumentException("Job title must not be empty");
        }
        this.jobTitle = jobTitle;
    }
}

