/*
 * MantisBT REST API
 * For the sandbox to work, MantisBT must be hosted at the root folder of the host. For example: http://mantishost/ rather http://host/mantisbt.  If that is not the case, then create a host alias to map it as such or edit swagger.json to change basePath to include the mantisbt folder name.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LocalizedString
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:10:27.068-05:00")
public class LocalizedString {
  @SerializedName("name")
  private String name = null;

  @SerializedName("localized")
  private String localized = null;

  public LocalizedString name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalizedString localized(String localized) {
    this.localized = localized;
    return this;
  }

   /**
   * Get localized
   * @return localized
  **/
  @ApiModelProperty(value = "")
  public String getLocalized() {
    return localized;
  }

  public void setLocalized(String localized) {
    this.localized = localized;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedString localizedString = (LocalizedString) o;
    return Objects.equals(this.name, localizedString.name) &&
        Objects.equals(this.localized, localizedString.localized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedString {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

