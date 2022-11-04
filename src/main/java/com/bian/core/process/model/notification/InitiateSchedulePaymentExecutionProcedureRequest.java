package com.bian.core.process.model.notification;

import java.util.Objects;
import com.bian.core.process.model.notification.InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSchedulePaymentExecutionProcedureRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-04T08:18:37.554Z[GMT]")

public class InitiateSchedulePaymentExecutionProcedureRequest   {
  @JsonProperty("PaymentExecutionProcedure")
  private InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure;

  public InitiateSchedulePaymentExecutionProcedureRequest paymentExecutionProcedure(InitiateSchedulePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
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
    InitiateSchedulePaymentExecutionProcedureRequest initiateSchedulePaymentExecutionProcedureRequest = (InitiateSchedulePaymentExecutionProcedureRequest) o;
    return Objects.equals(this.paymentExecutionProcedure, initiateSchedulePaymentExecutionProcedureRequest.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSchedulePaymentExecutionProcedureRequest {\n");
    
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

