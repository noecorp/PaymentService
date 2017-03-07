/*
 * IUNO TDM Payment Service API
 * Create invoices, check payment and forward coins.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * AddressValuePair
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-07T14:06:02.497Z")
public class AddressValuePair   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("coin")
  private Long coin = null;

  public AddressValuePair address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Bitcoin Base58 encoded public key hash address
   * @return address
  **/
  @JsonProperty("address")
  @ApiModelProperty(value = "Bitcoin Base58 encoded public key hash address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AddressValuePair coin(Long coin) {
    this.coin = coin;
    return this;
  }

   /**
   * value in Satoshis
   * @return coin
  **/
  @JsonProperty("coin")
  @ApiModelProperty(value = "value in Satoshis")
  public Long getCoin() {
    return coin;
  }

  public void setCoin(Long coin) {
    this.coin = coin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressValuePair addressValuePair = (AddressValuePair) o;
    return Objects.equals(this.address, addressValuePair.address) &&
        Objects.equals(this.coin, addressValuePair.coin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, coin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressValuePair {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
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

