package com.xzl.algorithm.sync.stravaBean;

/**
 * @author xzl
 * @date 2022-10-28 17:57
 **/
public class StravaUpload {
    private long id;
    private String name;
    private int progress;
    private String workflow;
    private String start_date;
    private String error;
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    public int getProgress() {
        return progress;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }
    public String getWorkflow() {
        return workflow;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getStart_date() {
        return start_date;
    }

    public void setError(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }

}
