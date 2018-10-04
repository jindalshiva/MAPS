package info.androidhive.bottomsheet;

import android.widget.Button;

public class Locationu {
    private String num;
    private String loca;
    private Button pass;

    public Locationu(String num, String loca, Button pass) {
        this.num = num;
        this.loca = loca;
        this.pass = pass;
    }

    public String getNum() {
        return num;
    }

    public String getLoca() {
        return loca;
    }

    public Button getPass() {
        return pass;
    }
}
