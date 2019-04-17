package com.yifeng.yfshop.service.search.provider.mapper;

import com.yifeng.yfshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbItemResultMapper {
    List<TbItemResult> selectAll();
}
