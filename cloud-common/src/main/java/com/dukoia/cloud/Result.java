package com.dukoia.cloud;

import com.dukoia.cloud.constants.ResultCodeConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: Result
 * @Author: jiangze.He
 * @Date: 2021-06-17
 * @Version: v1.0
 */
@Data
@Accessors(chain = true)
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;



    public boolean success(){
        return this.code.equals(ResultCodeConstant.SUCCESS_CODE);
    }

}
