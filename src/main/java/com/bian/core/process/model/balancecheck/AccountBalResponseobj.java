package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjBalAmt;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjBankBranchOrLocationReference;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjCustStat;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjCustomerReference;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjPostAddr;
import com.bian.core.process.model.balancecheck.AccountBalResponseobjRelPartyRec;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobj
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobj   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("CustomerReference")
  private AccountBalResponseobjCustomerReference customerReference;

  @JsonProperty("BankBranchOrLocationReference")
  private AccountBalResponseobjBankBranchOrLocationReference bankBranchOrLocationReference;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("BalType")
  private String balType;

  @JsonProperty("BalAmt")
  private AccountBalResponseobjBalAmt balAmt;

  @JsonProperty("CustStat")
  private AccountBalResponseobjCustStat custStat;

  @JsonProperty("AcctBal")
  private String acctBal;

  @JsonProperty("RelPartyRec")
  private AccountBalResponseobjRelPartyRec relPartyRec;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PostAddr")
  private AccountBalResponseobjPostAddr postAddr;

  public AccountBalResponseobj productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public AccountBalResponseobj accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountBalResponseobj customerReference(AccountBalResponseobjCustomerReference customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjCustomerReference getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(AccountBalResponseobjCustomerReference customerReference) {
    this.customerReference = customerReference;
  }

  public AccountBalResponseobj bankBranchOrLocationReference(AccountBalResponseobjBankBranchOrLocationReference bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjBankBranchOrLocationReference getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(AccountBalResponseobjBankBranchOrLocationReference bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public AccountBalResponseobj accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountBalResponseobj currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountBalResponseobj balType(String balType) {
    this.balType = balType;
    return this;
  }

  /**
   * Get balType
   * @return balType
  */
  @ApiModelProperty(value = "")


  public String getBalType() {
    return balType;
  }

  public void setBalType(String balType) {
    this.balType = balType;
  }

  public AccountBalResponseobj balAmt(AccountBalResponseobjBalAmt balAmt) {
    this.balAmt = balAmt;
    return this;
  }

  /**
   * Get balAmt
   * @return balAmt
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjBalAmt getBalAmt() {
    return balAmt;
  }

  public void setBalAmt(AccountBalResponseobjBalAmt balAmt) {
    this.balAmt = balAmt;
  }

  public AccountBalResponseobj custStat(AccountBalResponseobjCustStat custStat) {
    this.custStat = custStat;
    return this;
  }

  /**
   * Get custStat
   * @return custStat
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjCustStat getCustStat() {
    return custStat;
  }

  public void setCustStat(AccountBalResponseobjCustStat custStat) {
    this.custStat = custStat;
  }

  public AccountBalResponseobj acctBal(String acctBal) {
    this.acctBal = acctBal;
    return this;
  }

  /**
   * Get acctBal
   * @return acctBal
  */
  @ApiModelProperty(value = "")


  public String getAcctBal() {
    return acctBal;
  }

  public void setAcctBal(String acctBal) {
    this.acctBal = acctBal;
  }

  public AccountBalResponseobj relPartyRec(AccountBalResponseobjRelPartyRec relPartyRec) {
    this.relPartyRec = relPartyRec;
    return this;
  }

  /**
   * Get relPartyRec
   * @return relPartyRec
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjRelPartyRec getRelPartyRec() {
    return relPartyRec;
  }

  public void setRelPartyRec(AccountBalResponseobjRelPartyRec relPartyRec) {
    this.relPartyRec = relPartyRec;
  }

  public AccountBalResponseobj positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public AccountBalResponseobj positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public AccountBalResponseobj dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public AccountBalResponseobj postAddr(AccountBalResponseobjPostAddr postAddr) {
    this.postAddr = postAddr;
    return this;
  }

  /**
   * Get postAddr
   * @return postAddr
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalResponseobjPostAddr getPostAddr() {
    return postAddr;
  }

  public void setPostAddr(AccountBalResponseobjPostAddr postAddr) {
    this.postAddr = postAddr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobj accountBalResponseobj = (AccountBalResponseobj) o;
    return Objects.equals(this.productInstanceReference, accountBalResponseobj.productInstanceReference) &&
        Objects.equals(this.accountId, accountBalResponseobj.accountId) &&
        Objects.equals(this.customerReference, accountBalResponseobj.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, accountBalResponseobj.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, accountBalResponseobj.accountType) &&
        Objects.equals(this.currency, accountBalResponseobj.currency) &&
        Objects.equals(this.balType, accountBalResponseobj.balType) &&
        Objects.equals(this.balAmt, accountBalResponseobj.balAmt) &&
        Objects.equals(this.custStat, accountBalResponseobj.custStat) &&
        Objects.equals(this.acctBal, accountBalResponseobj.acctBal) &&
        Objects.equals(this.relPartyRec, accountBalResponseobj.relPartyRec) &&
        Objects.equals(this.positionLimitSettings, accountBalResponseobj.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, accountBalResponseobj.positionLimitValue) &&
        Objects.equals(this.dateType, accountBalResponseobj.dateType) &&
        Objects.equals(this.postAddr, accountBalResponseobj.postAddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, accountId, customerReference, bankBranchOrLocationReference, accountType, currency, balType, balAmt, custStat, acctBal, relPartyRec, positionLimitSettings, positionLimitValue, dateType, postAddr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobj {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balType: ").append(toIndentedString(balType)).append("\n");
    sb.append("    balAmt: ").append(toIndentedString(balAmt)).append("\n");
    sb.append("    custStat: ").append(toIndentedString(custStat)).append("\n");
    sb.append("    acctBal: ").append(toIndentedString(acctBal)).append("\n");
    sb.append("    relPartyRec: ").append(toIndentedString(relPartyRec)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    postAddr: ").append(toIndentedString(postAddr)).append("\n");
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

