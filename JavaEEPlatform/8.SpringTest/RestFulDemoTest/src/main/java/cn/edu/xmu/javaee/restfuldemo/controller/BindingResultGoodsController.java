package cn.edu.xmu.javaee.restfuldemo.controller;

import cn.edu.xmu.javaee.restfuldemo.controller.vo.GoodsVo;
import cn.edu.xmu.javaee.restfuldemo.model.Goods;
import cn.edu.xmu.javaee.restfuldemo.service.GoodsService;
import cn.edu.xmu.javaee.restfuldemo.util.ResponseCode;
import cn.edu.xmu.javaee.restfuldemo.util.ResponseUtil;
import cn.edu.xmu.javaee.restfuldemo.util.ReturnObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * 采用BindingError的商品控制器
 * @author Ming Qiu
 */
@RestController /*Restful的Controller对象*/
@RequestMapping(value = "/bindingresult/goods", produces = "application/json;charset=UTF-8")
public class BindingResultGoodsController {

    private final Logger logger = LoggerFactory.getLogger(BindingResultGoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @PostMapping("")
    public Object createGood(@Validated @RequestBody GoodsVo goodsVo, BindingResult bindingResult){
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        if (bindingResult.hasErrors()){
            logger.info("商品名称不能为空");
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            ReturnObject retObj = new ReturnObject();
            retObj.setErrmsg("商品名称不能为空");
            retObj.setErrno(ResponseCode.OK);
            return retObj;
        }

        Goods new_goods = goodsService.createGoods(goodsVo);
        httpServletResponse.setStatus(HttpServletResponse.SC_CREATED);
        return ResponseUtil.ok(new_goods);
    }
}
