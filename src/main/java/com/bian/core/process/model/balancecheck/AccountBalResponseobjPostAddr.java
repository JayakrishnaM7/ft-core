package com.bian.core.process.model.balancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBalResponseobjPostAddr
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:31.655Z[GMT]")

public class AccountBalResponseobjPostAddr   {
  @JsonProperty("Addr1")
  private String addr1;

  @JsonProperty("Addr2")
  private String addr2;

  @JsonProperty("Addr3")
  private String addr3;

  @JsonProperty("City")
  private String city;

  @JsonProperty("StateProv")
  private String stateProv;

  @JsonProperty("PostalCode")
  private String postalCode;

  @JsonProperty("Country")
  private String country;

  @JsonProperty("AddrType")
  private String addrType;

  public AccountBalResponseobjPostAddr addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

  /**
   * Get addr1
   * @return addr1
  */
  @ApiModelProperty(value = "")


  public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public AccountBalResponseobjPostAddr addr2(String addr2) {
    this.addr2 = addr2;
    return this;
  }

  /**
   * Get addr2
   * @return addr2
  */
  @ApiModelProperty(value = "")


  public String getAddr2() {
    return addr2;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }

  public AccountBalResponseobjPostAddr addr3(String addr3) {
    this.addr3 = addr3;
    return this;
  }

  /**
   * Get addr3
   * @return addr3
  */
  @ApiModelProperty(value = "")


  public String getAddr3() {
    return addr3;
  }

  public void setAddr3(String addr3) {
    this.addr3 = addr3;
  }

  public AccountBalResponseobjPostAddr city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountBalResponseobjPostAddr stateProv(String stateProv) {
    this.stateProv = stateProv;
    return this;
  }

  /**
   * Get stateProv
   * @return stateProv
  */
  @ApiModelProperty(value = "")


  public String getStateProv() {
    return stateProv;
  }

  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }

  public AccountBalResponseobjPostAddr postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  @ApiModelProperty(value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AccountBalResponseobjPostAddr country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountBalResponseobjPostAddr addrType(String addrType) {
    this.addrType = addrType;
    return this;
  }

  /**
   * Get addrType
   * @return addrType
  */
  @ApiModelProperty(value = "")


  public String getAddrType() {
    return addrType;
  }

  public void setAddrType(String addrType) {
    this.addrType = addrType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalResponseobjPostAddr accountBalResponseobjPostAddr = (AccountBalResponseobjPostAddr) o;
    return Objects.equals(this.addr1, accountBalResponseobjPostAddr.addr1) &&
        Objects.equals(this.addr2, accountBalResponseobjPostAddr.addr2) &&
        Objects.equals(this.addr3, accountBalResponseobjPostAddr.addr3) &&
        Objects.equals(this.city, accountBalResponseobjPostAddr.city) &&
        Objects.equals(this.stateProv, accountBalResponseobjPostAddr.stateProv) &&
        Objects.equals(this.postalCode, accountBalResponseobjPostAddr.postalCode) &&
        Objects.equals(this.country, accountBalResponseobjPostAddr.country) &&
        Objects.equals(this.addrType, accountBalResponseobjPostAddr.addrType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr1, addr2, addr3, city, stateProv, postalCode, country, addrType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalResponseobjPostAddr {\n");
    
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    addr3: ").append(toIndentedString(addr3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
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

