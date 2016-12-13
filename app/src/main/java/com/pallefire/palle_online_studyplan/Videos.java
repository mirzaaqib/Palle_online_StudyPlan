package com.pallefire.palle_online_studyplan;

/**
 * Created by Mirzaaqibbeg on 13-12-2016.
 */

public class Videos {
    private String Sno,Vname,Vduration;

    public Videos(String sno, String vname, String vduration) {
        Sno = sno;
        Vname = vname;
        Vduration = vduration;
    }

    public String getSno() {
        return Sno;
    }

    public String getVname() {
        return Vname;
    }

    public String getVduration() {
        return Vduration;
    }
}
