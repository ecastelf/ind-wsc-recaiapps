package com.inditex.zara.recaieventsingestion.domain.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Created by jbuenosv@google.com
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-11T18:14:13.865Z[GMT]")
public class ErrorResponse {
    @JsonProperty("code")
    private Integer code = null;

    @JsonProperty("error")
    private String error = null;

    public ErrorResponse code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @Schema(example = "100", description = "")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ErrorResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @Schema(example = "An error has ocurred", description = "")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) o;
        return Objects.equals(this.code, errorResponse.code) &&
                Objects.equals(this.error, errorResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

