package com.sudichina.study.grendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class Route {


    @Id(autoincrement = true)
    private Long myid;
    /**经度**/
    private double longitude;
    /**纬度**/
    private double latitude;

    @Generated(hash = 467302284)
    public Route(Long myid, double longitude, double latitude) {
        this.myid = myid;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Generated(hash = 467763370)
    public Route() {
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Long getMyid() {
        return this.myid;
    }

    public void setMyid(Long myid) {
        this.myid = myid;
    }
}
