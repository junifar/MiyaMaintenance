
package com.rubahapi.maintenance.pojo.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class D {

    @SerializedName("__type")
    @Expose
    private String type;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("ProjectID")
    @Expose
    private String projectID;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

}
