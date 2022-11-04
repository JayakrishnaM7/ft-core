package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobjCustStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobjCustStat   {
  @JsonProperty("refCode")
  private String refCode;

  @JsonProperty("refRecType")
  private String refRecType;

  @JsonProperty("refDesc")
  private String refDesc;

  public AccountBalResponseobjCustStat refCode(String refCode) {
    this.refCode = refCode;
    return this;
  }

  /**
   * Get refCode
   * @return refCode
  */
  @ApiModelProperty(value = "")


  public String getRefCode() {
    return refCode;
  }

  public void setRefCode(String refCode) {
    this.refCode = refCode;
  }

  public AccountBalResponseobjCustStat refRecType(String refRecType) {
    this.refRecType = refRecType;
    return this;
  }

  /**
   * Get refRecType
   * @return refRecType
  */
  @ApiModelProperty(value = "")


  public String getRefRecType() {
    return refRecType;
  }

  public void setRefRecType(String refRecType) {
    this.refRecType = refRecType;
  }

  public AccountBalResponseobjCustStat refDesc(String refDesc) {
    this.refDesc = refDesc;
    return this;
  }

  /**
   * Get refDesc
   * @return refDesc
  */
  @ApiModelProperty(value = "")


  public String getRefDesc() {
    return refDesc;
  }

  public void setRefDesc(String refDesc) {
    this.refDesc = refDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobjCustStat accountBalResponseobjCustStat = (AccountBalResponseobjCustStat) o;
    return Objects.equals(this.refCode, accountBalResponseobjCustStat.refCode) &&
        Objects.equals(this.refRecType, accountBalResponseobjCustStat.refRecType) &&
        Objects.equals(this.refDesc, accountBalResponseobjCustStat.refDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refCode, refRecType, refDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobjCustStat {\n");
    
    sb.append("    refCode: ").append(toIndentedString(refCode)).append("\n");
    sb.append("    refRecType: ").append(toIndentedString(refRecType)).append("\n");
    sb.append("    refDesc: ").append(toIndentedString(refDesc)).append("\n");
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

