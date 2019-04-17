package com.yifeng.yfshop.service.content.api;

import com.github.pagehelper.PageInfo;
import com.yifeng.yfshop.commons.domain.TbContent;

public interface TbContentService {
    /**
     * 分页查询
     * @param start
     * @param length
     * @param tbContent
     * @return
     */
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
