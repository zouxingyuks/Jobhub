package com.xuexiang.templateproject;

import com.xuexiang.templateproject.core.http.entity.TipInfo;
import com.xuexiang.xhttp2.model.ApiResult;
import com.xuexiang.xutil.net.JsonUtil;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);


        TipInfo info = new TipInfo();
        info.setTitle("提示");
        info.setContent("这只是个半成品");
        List<TipInfo> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(info);
        }
        ApiResult<List<TipInfo>> result = new ApiResult<>();
        result.setData(list);
        System.out.println(JsonUtil.toJson(result));
    }
}