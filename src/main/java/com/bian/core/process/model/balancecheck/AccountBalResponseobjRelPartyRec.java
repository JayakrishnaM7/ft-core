package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobjRelPartyRec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobjRelPartyRec   {
  @JsonProperty("Customer")
  private String customer;

  @JsonProperty("Gender")
  private String gender;

  @JsonProperty("DateOfBirth")
  private String dateOfBirth;

  @JsonProperty("KYCEntry")
  private String kyCEntry;

  public AccountBalResponseobjRelPartyRec customer(String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty(value = "")


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public AccountBalResponseobjRelPartyRec gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public AccountBalResponseobjRelPartyRec dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public AccountBalResponseobjRelPartyRec kyCEntry(String kyCEntry) {
    this.kyCEntry = kyCEntry;
    return this;
  }

  /**
   * Get kyCEntry
   * @return kyCEntry
  */
  @ApiModelProperty(value = "")


  public String getKyCEntry() {
    return kyCEntry;
  }

  public void setKyCEntry(String kyCEntry) {
    this.kyCEntry = kyCEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobjRelPartyRec accountBalResponseobjRelPartyRec = (AccountBalResponseobjRelPartyRec) o;
    return Objects.equals(this.customer, accountBalResponseobjRelPartyRec.customer) &&
        Objects.equals(this.gender, accountBalResponseobjRelPartyRec.gender) &&
        Objects.equals(this.dateOfBirth, accountBalResponseobjRelPartyRec.dateOfBirth) &&
        Objects.equals(this.kyCEntry, accountBalResponseobjRelPartyRec.kyCEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, gender, dateOfBirth, kyCEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobjRelPartyRec {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    kyCEntry: ").append(toIndentedString(kyCEntry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

