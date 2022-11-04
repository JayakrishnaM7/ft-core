package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobjCustomerReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobjCustomerReference   {
  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("MiddleName")
  private String middleName;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("TitlePrefix")
  private String titlePrefix;

  @JsonProperty("CustName")
  private String custName;

  public AccountBalResponseobjCustomerReference lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountBalResponseobjCustomerReference firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountBalResponseobjCustomerReference middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  @ApiModelProperty(value = "")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public AccountBalResponseobjCustomerReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountBalResponseobjCustomerReference titlePrefix(String titlePrefix) {
    this.titlePrefix = titlePrefix;
    return this;
  }

  /**
   * Get titlePrefix
   * @return titlePrefix
  */
  @ApiModelProperty(value = "")


  public String getTitlePrefix() {
    return titlePrefix;
  }

  public void setTitlePrefix(String titlePrefix) {
    this.titlePrefix = titlePrefix;
  }

  public AccountBalResponseobjCustomerReference custName(String custName) {
    this.custName = custName;
    return this;
  }

  /**
   * Get custName
   * @return custName
  */
  @ApiModelProperty(value = "")


  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobjCustomerReference accountBalResponseobjCustomerReference = (AccountBalResponseobjCustomerReference) o;
    return Objects.equals(this.lastName, accountBalResponseobjCustomerReference.lastName) &&
        Objects.equals(this.firstName, accountBalResponseobjCustomerReference.firstName) &&
        Objects.equals(this.middleName, accountBalResponseobjCustomerReference.middleName) &&
        Objects.equals(this.name, accountBalResponseobjCustomerReference.name) &&
        Objects.equals(this.titlePrefix, accountBalResponseobjCustomerReference.titlePrefix) &&
        Objects.equals(this.custName, accountBalResponseobjCustomerReference.custName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, middleName, name, titlePrefix, custName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobjCustomerReference {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    titlePrefix: ").append(toIndentedString(titlePrefix)).append("\n");
    sb.append("    custName: ").append(toIndentedString(custName)).append("\n");
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

