package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobjBalAmt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobjBalAmt   {
  @JsonProperty("amountValue")
  private String amountValue;

  @JsonProperty("amountCode")
  private String amountCode;

  @JsonProperty("currencyCode")
  private String currencyCode;

  public AccountBalResponseobjBalAmt amountValue(String amountValue) {
    this.amountValue = amountValue;
    return this;
  }

  /**
   * Get amountValue
   * @return amountValue
  */
  @ApiModelProperty(value = "")


  public String getAmountValue() {
    return amountValue;
  }

  public void setAmountValue(String amountValue) {
    this.amountValue = amountValue;
  }

  public AccountBalResponseobjBalAmt amountCode(String amountCode) {
    this.amountCode = amountCode;
    return this;
  }

  /**
   * Get amountCode
   * @return amountCode
  */
  @ApiModelProperty(value = "")


  public String getAmountCode() {
    return amountCode;
  }

  public void setAmountCode(String amountCode) {
    this.amountCode = amountCode;
  }

  public AccountBalResponseobjBalAmt currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobjBalAmt accountBalResponseobjBalAmt = (AccountBalResponseobjBalAmt) o;
    return Objects.equals(this.amountValue, accountBalResponseobjBalAmt.amountValue) &&
        Objects.equals(this.amountCode, accountBalResponseobjBalAmt.amountCode) &&
        Objects.equals(this.currencyCode, accountBalResponseobjBalAmt.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountValue, amountCode, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobjBalAmt {\n");
    
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    amountCode: ").append(toIndentedString(amountCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

