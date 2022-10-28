package com.xzl.algorithm.sync;

import cn.hutool.core.io.StreamProgress;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.xzl.algorithm.sync.garminBean.Activity;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xzl
 * @date 2022-10-28 16:41
 **/
public class GarminServer {

    private String garminListUrl = "https://connect.garmin.cn/activitylist-service/activities/search/activities";

    private String garminExportGpxUrl = "https://connect.garmin.cn/download-service/export/gpx/activity/";

    private static Map<String, List<String>> baseGarminHeader = new HashMap<>();

    static {
        baseGarminHeader.put("authorization", Lists.newArrayList("Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImRpLW9hdXRoLXNpZ25lci1wcm9kLWNuMS0yMDIyIn0.eyJzY29wZSI6WyJBVFBfUkVBRCIsIkFUUF9XUklURSIsIkNPTk5FQ1RfTk9OX1NPQ0lBTF9TSEFSRURfUkVBRCIsIkNPTk5FQ1RfUkVBRCIsIkNPTk5FQ1RfV1JJVEUiLCJESVZFX1NIQVJFRF9SRUFEIiwiR09MRl9BUElfUkVBRCIsIkdPTEZfQVBJX1dSSVRFIiwiR09MRl9TSEFSRURfUkVBRCIsIklOU0lHSFRTX1JFQUQiLCJJTlNJR0hUU19XUklURSJdLCJpc3MiOiJodHRwczovL2RpYXV0aC5nYXJtaW4uY24iLCJleHAiOjE2NjY5NTMwNzEsImlhdCI6MTY2Njk0OTQ3MSwiZ2FybWluX2d1aWQiOiJiNDc0MjM4ZC03MjE1LTRiM2YtODg1OC0yY2Q3ZmQzOGY0ZjgiLCJqdGkiOiI0YzE2ZTNiMS1kYzMxLTQ1YmYtYTg5Zi00Yzc4Yjc0NjNmMWYiLCJjbGllbnRfaWQiOiJDT05ORUNUX1dFQiJ9.AmSMW2kXsV2vf54LcltCNOCezI7bzpARPEfwk5XNEL8ueOmezCZEG8x7Rvbl-CTPijGN9Qlfc6FHfL5auaHXsHXlWnTgT-SElSqglM4DuAPeCdiP1STRO8VbXSfRxOwXw5OIDLGqtBnLzi0F-pb_6nfTYbex5DCCR3OBFjZJhbbMxkKabOdLGD2qbq7WCQtG9VLK_Tvp9G0w-GYxXfx39FYVWnYS0_RxJHKk0AQoHw8KqN0GFpSZBxIocRZNskin48MduXcaZk376AxJZfd4NLGB4SAPpirgNHwpO-e0SF7NGUGXIaFl23D7fkvDo3oAQN_vWtURg5s2T0y2-Wec0Q"));
        baseGarminHeader.put("di-backend", Lists.newArrayList("connectapi.garmin.cn"));
    }


    public List<Activity> getGarminList() {
        String response = HttpRequest.get(garminListUrl)
                .form("limit", 5)
                .form("start", 0)
                .form("_", new Date().getTime())
                .header(baseGarminHeader)
                .execute()
                .body();
        return JSON.parseArray(response, Activity.class);
    }

    public String exportGpx(Long activityId) {
        HttpRequest.get(garminExportGpxUrl+activityId)
                .header(baseGarminHeader)
                .header(Header.CONTENT_TYPE, "application/gpx;charset=UTF-8")
                .execute()
                .writeBodyForFile(new File("/Users/xuzilou/Downloads/"), new StreamProgress() {
                    @Override
                    public void start() {

                    }

                    @Override
                    public void progress(long progressSize) {

                    }

                    @Override
                    public void finish() {
                        System.out.println("下载完成");
                    }
                });
        return "/Users/xuzilou/Downloads/activity_" + activityId + ".gpx";
    }
}