package com.yifeng.yfshop.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.yifeng.yfshop.commons.domain.TbUser;
import com.yifeng.yfshop.service.user.api.TbUserService;
import com.yifeng.yfshop.statics.backend.dto.DataTableDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

 /*   @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        PageInfo<TbUser> pageInfo = tbUserService.page(1, 2,null);
        System.out.print(pageInfo.getSize());
        List<TbUser> tbUsers = tbUserService.selectAll();
       // model.addAttribute("tbUsers", tbUsers);
        model.addAttribute("pageInfo", pageInfo);
        return "user/list";
    }*/

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        return "user/list";
    }


    @ResponseBody
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public DataTableDTO<TbUser> page(HttpServletRequest request, TbUser tbUser) {
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        // 封装 Datatables 需要的结果
        PageInfo<TbUser> pageInfo = tbUserService.page(start, length, tbUser);
        DataTableDTO<TbUser> dataTableDTO = new DataTableDTO<>();
        dataTableDTO.setData(pageInfo.getList());
        dataTableDTO.setDraw(draw);
        dataTableDTO.setRecordsTotal(pageInfo.getTotal());
        dataTableDTO.setRecordsFiltered(pageInfo.getTotal());

        return dataTableDTO;
    }
}
