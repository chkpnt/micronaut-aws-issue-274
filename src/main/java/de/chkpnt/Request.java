package de.chkpnt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Schema
@Introspected
public class Request {

    @Email
    @NotNull
    @Schema(description = "An email address.",
            required = true,
            example = "john.doe@example.com")
    @JsonProperty
    private String emailAddress;

    @Size(max = 20)
    @Schema(example = "John Doe")
    @JsonProperty
    private String name;

    @NotNull
    @Schema(description = "The person's salutation.",
            required = true,
            example = "MR")
    @JsonProperty
    private Salutation salutation;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("emailAddress", emailAddress)
                .add("name", name)
                .add("salutation", salutation)
                .toString();
    }

    public enum Salutation {
        MR, MRS, NOT_SELECTED
    }

}
