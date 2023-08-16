package io.github.mat3e;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("task")
class TaskConfigurationProperties {
    private boolean allowMultipleTaskFormTemplate;

    public boolean isAllowMultipleTaskFormTemplate() {
        return allowMultipleTaskFormTemplate;
    }

    public void setAllowMultipleTaskFormTemplate(boolean allowMultipleTaskFormTemplate) {
        this.allowMultipleTaskFormTemplate = allowMultipleTaskFormTemplate;
    }
}
