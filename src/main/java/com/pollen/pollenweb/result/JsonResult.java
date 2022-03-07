package com.pollen.pollenweb.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult implements Serializable {
    private String code;
    private String message;
    private Object data;
}
