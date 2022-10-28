package com.xzl.algorithm.sync;

import com.alibaba.fastjson.JSON;
import com.xzl.algorithm.sync.garminBean.Activity;
import com.xzl.algorithm.sync.stravaBean.StravaUpload;

import java.io.File;
import java.util.List;

/**
 * @author xzl
 * @date 2022-10-28 16:39
 **/
public class GarminSyncStrava {

    static GarminServer garminServer = new GarminServer();

    static StravaServer stravaServer = new StravaServer();


    public static void main(String[] args) {
        List<Activity> garminList = garminServer.getGarminList();
        System.out.println(JSON.toJSONString(garminList));
        for (Activity activity : garminList) {
            String filePath = garminServer.exportGpx(activity.getActivityId());
            List<StravaUpload> upload = stravaServer.upload(new File(filePath));
            System.out.println(JSON.toJSONString(upload));
            for (StravaUpload stravaUpload : upload) {
                System.out.println(stravaServer.uploadResults(stravaUpload.getId()));
            }
        }
    }
}
