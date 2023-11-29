package com.delivery.api.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode implements ErrorCodeIfs {
    OK(200,200, "성공"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), 400,"잘못된 요청"),
    SEVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), 500,"서버에러"),
    NULL_POINT(HttpStatus.INTERNAL_SERVER_ERROR.value(),512,"Null point")
    ;
    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String description;

// @Getter을 달아주면 적을 필요가 없음 인터페이스에서 상속받는 메소드와 클래스의 변수명 get메소드가 같기 때문
//    @Override
//    public Integer getHttpStatusCode() {
//        return this.httpStatusCode;
//    }
//
//    @Override
//    public Integer getErrorCode() {
//        return this.errorCode;
//    }
//
//    @Override
//    public String getDescription() {
//        return this.description;
//    }
}