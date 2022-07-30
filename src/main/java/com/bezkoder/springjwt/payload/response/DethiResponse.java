package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.common.response.AbstractResponse;
import com.bezkoder.springjwt.models.Dethi;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DethiResponse extends AbstractResponse {
   List<Dethi> list;
}
