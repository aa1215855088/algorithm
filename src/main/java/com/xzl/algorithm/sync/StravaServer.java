package com.xzl.algorithm.sync;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.xzl.algorithm.sync.stravaBean.StravaUpload;

import java.io.File;
import java.util.List;

/**
 * @author xzl
 * @date 2022-10-28 17:43
 **/
public class StravaServer {

    private String stravaUploadUrl = "https://www.strava.com/upload/files";

    private String stravaUploadResultsUrl = "https://www.strava.com/upload/progress.json?ids[]=";

    public List<StravaUpload> upload(File file){
        String body = HttpRequest.post(stravaUploadUrl)
                .form("files[]", file)
                .form("_method", "post")
                .form("authenticity_token", "LWcxgWZqMr9FdniR7F+qhMhQM4zn1t68ContxhxHajzaOSWuLjNAu8bH5/FefW7p/xhhSaxx1KqEZf2lXg9uvQ==")
                .header("cookie", "xp_session_identifier=afb831dea16e9e0b75f880ab1c4d4dd1; _sp_ses.047d=*; sp=678e5075-9894-48bb-b2dc-c408494bdfa5; _strava4_session=jirq3fuq1diifb5ibib8fsnn9nb8gb3g; strava_remember_id=106656806; strava_remember_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25pbmdfa2V5IjoidjEiLCJlbmNyeXB0aW9uX2tleSI6InYxIiwiaXYiOiJSRktJdVlvTE04U1ZVWWJ1cFY4YytnPT1cbiJ9.eyJpc3MiOiJjb20uc3RyYXZhLmF0aGxldGVzIiwic3ViIjoxMDY2NTY4MDYsImlhdCI6MTY2NjkzNTMxOSwiZXhwIjoxNjY5NTI3MzE5LCJlbWFpbCI6IjZ5dHJwUG93TlM0WUc2THFtR0RpNzVmVHBIeDgvbHNrWk9kM3dFQkxvSFF4amN2NCt3R1N3cDF2MDFQeVxuTkJLTUF5TTVzTytHNGdlWVBwdUFJY05vNHc9PVxuIn0.BbgM8JqVBxOy9imK3snxfbBwog4rjQucFCZ-t-XhmpY; _sp_id.f55d=10d7e642-50ed-4969-899e-222466e2e99b.1666939201.1.1666939201.1666939201.4b386f0c-7fa8-4f01-bf29-ab9513007172; _sp_id.047d=b25a23cc-add7-4dbf-95fd-8781f06d3232.1666935323.1.1666943882..97a31e66-209e-452e-baf3-71950b9af4d7")
                .execute()
                .body();
        return JSON.parseArray(body, StravaUpload.class);
    }

    public String uploadResults(Long id){
        return HttpRequest.get(stravaUploadResultsUrl+id)
                .header("cookie", "xp_session_identifier=afb831dea16e9e0b75f880ab1c4d4dd1; _sp_ses.047d=*; sp=678e5075-9894-48bb-b2dc-c408494bdfa5; _strava4_session=jirq3fuq1diifb5ibib8fsnn9nb8gb3g; strava_remember_id=106656806; strava_remember_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25pbmdfa2V5IjoidjEiLCJlbmNyeXB0aW9uX2tleSI6InYxIiwiaXYiOiJSRktJdVlvTE04U1ZVWWJ1cFY4YytnPT1cbiJ9.eyJpc3MiOiJjb20uc3RyYXZhLmF0aGxldGVzIiwic3ViIjoxMDY2NTY4MDYsImlhdCI6MTY2NjkzNTMxOSwiZXhwIjoxNjY5NTI3MzE5LCJlbWFpbCI6IjZ5dHJwUG93TlM0WUc2THFtR0RpNzVmVHBIeDgvbHNrWk9kM3dFQkxvSFF4amN2NCt3R1N3cDF2MDFQeVxuTkJLTUF5TTVzTytHNGdlWVBwdUFJY05vNHc9PVxuIn0.BbgM8JqVBxOy9imK3snxfbBwog4rjQucFCZ-t-XhmpY; _sp_id.f55d=10d7e642-50ed-4969-899e-222466e2e99b.1666939201.1.1666939201.1666939201.4b386f0c-7fa8-4f01-bf29-ab9513007172; _sp_id.047d=b25a23cc-add7-4dbf-95fd-8781f06d3232.1666935323.1.1666943882..97a31e66-209e-452e-baf3-71950b9af4d7")
                .execute()
                .body();
    }
}
