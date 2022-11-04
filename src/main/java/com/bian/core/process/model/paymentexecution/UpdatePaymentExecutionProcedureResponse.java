package com.bian.core.process.model.paymentexecution;

import java.util.Objects;
import com.bian.core.process.model.paymentexecution.InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentExecutionProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:37.554Z[GMT]")

public class UpdatePaymentExecutionProcedureResponse   {
  @JsonProperty("PaymentExecutionProcedure")
  private InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure;

  public UpdatePaymentExecutionProcedureResponse paymentExecutionProcedure(InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentExecutionProcedureResponse updatePaymentExecutionProcedureResponse = (UpdatePaymentExecutionProcedureResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, updatePaymentExecutionProcedureResponse.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentExecutionProcedureResponse {\n");
    
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
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

