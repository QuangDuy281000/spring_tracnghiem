package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Dethi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 * Cài đặt các phương thức liên quan đến Dethi
 * @author Duy
 */
public interface DethiService {
    /**
     * <p style="color: red">Tìm kiếm, hiển thị danh sách đề thi dưới dạng phân trang</p>
     * @return ResponseEntity<Map<String, Object>>
     */
   List<Dethi> gellAllDethi();

}
