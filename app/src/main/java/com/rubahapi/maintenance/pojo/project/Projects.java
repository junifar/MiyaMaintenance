
package com.rubahapi.maintenance.pojo.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Projects {

    @SerializedName("d")
    @Expose
    private List<D> d = null;

    public List<D> getD() {
        return d;
    }

    public void setD(List<D> d) {
        this.d = d;
    }

}
