package com.bian.core.process.model.beneficiaries;

import java.util.Objects;
import com.bian.core.process.model.beneficiaries.UpdatePaymentsResponsePayments;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:24.253Z[GMT]")

public class UpdatePaymentsResponse   {
  @JsonProperty("Payments")
  private UpdatePaymentsResponsePayments payments;

  public UpdatePaymentsResponse payments(UpdatePaymentsResponsePayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdatePaymentsResponsePayments getPayments() {
    return payments;
  }

  public void setPayments(UpdatePaymentsResponsePayments payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentsResponse updatePaymentsResponse = (UpdatePaymentsResponse) o;
    return Objects.equals(this.payments, updatePaymentsResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentsResponse {\n");
    
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

