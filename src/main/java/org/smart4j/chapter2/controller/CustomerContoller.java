package org.smart4j.chapter2.controller;

/**
 * Created by japing on 16-10-25.
 */

import org.smart4j.chapter2.service.CustomService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.xml.ws.Action;


/**
 * 处理客户端请求
 */
@Controller
public class CustomerContoller {

    @Inject
    private CustomService customService;

    /**
     *
     */
//    @Action("get:/customer")
//    public View index(Param)

}
