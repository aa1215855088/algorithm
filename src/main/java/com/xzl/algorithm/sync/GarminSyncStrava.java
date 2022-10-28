package com.xzl.algorithm.sync;

import cn.hutool.core.date.DateUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import com.alibaba.fastjson.JSON;
import com.xzl.algorithm.sync.garminBean.Activity;
import com.xzl.algorithm.sync.stravaBean.StravaUpload;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @author xzl
 * @date 2022-10-28 16:39
 **/
public class GarminSyncStrava {

    static GarminServer garminServer = new GarminServer();

    static StravaServer stravaServer = new StravaServer();


    public static void main(String[] args) {

        System.out.println(DateUtil.tomorrow().getTime());
        CronUtil.schedule("0 0/2 * * * ? *", new Task() {
            @Override
            public void execute() {
                Date LastTime = new Date();
                List<Activity> garminList = garminServer.getGarminList();
                System.out.println(JSON.toJSONString(garminList));
                for (Activity activity : garminList) {
                    Date startTimeLocal = activity.getStartTimeLocal();
                    if (DateUtil.compare(LastTime, startTimeLocal) > 0) {
                        continue;
                    }
                    String filePath = garminServer.exportGpx(activity.getActivityId());
                    List<StravaUpload> upload = stravaServer.upload(new File(filePath));
                    System.out.println(JSON.toJSONString(upload));
                    for (StravaUpload stravaUpload : upload) {
                        System.out.println(stravaServer.uploadResults(stravaUpload.getId()));
                    }
                    LastTime = new Date();
                }
            }
        });

        CronUtil.setMatchSecond(true);
        CronUtil.start();


    }
}
