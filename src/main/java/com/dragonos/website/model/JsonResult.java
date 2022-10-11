package com.dragonos.website.model;

import lombok.Data;

@Data
public class JsonResult<T> {

    private String code;

    private String message;

    private T data;

    public JsonResult() {

    }

    public JsonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult(T data) {
        this("200", "success", data);
    }

    public static JsonResult ErrorResult(String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode("201");
        jsonResult.setMessage(message);
        return jsonResult;
    }

    public JsonResult SuccessResult(T data) {
        JsonResult<T> success = new JsonResult<>("200", "success", data);
        return success;
    }

    public static JsonResult TokenErrorJson(String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode("10010");
        jsonResult.setMessage(message);
        return jsonResult;
    }

}
