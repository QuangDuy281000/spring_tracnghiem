package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.common.response.AbstractResponse;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TrinhdoResponse extends AbstractResponse {
    private Long id;

    private String tendethi;

    private int thoigianthi;
}
