package com.yifeng.yfshop.statics.backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Bootstrap DataTable 数据传输对象
 * <p>Title: DataTableDTO</p>
 * <p>Description: </p>
 *
 * @author YiFeng
 * @version 1.0.0
 * @date 2019年4月2日10:12:47
 */
@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;
}
