package com.yifeng.yfshop.service.search.api;

import com.yifeng.yfshop.service.search.domain.TbItemResult;

import java.util.List;

public interface SearchService {
    List<TbItemResult> search(String query, int page, int rows);
}

