package comsandysiu.github.test;

/**
 * Created by Sandy on 2017/11/5.
 */

public class Infomation {

    private int mIcon;
    private String mStatue;
    private String mLine;
    private String mDate;

    public Infomation(int icon,String statue,String line,String date){
        this.mIcon = icon;
        this.mStatue = statue;
        this.mLine = line;
        this.mDate = date;
    }

    public void setmIcon (int icon){
        this.mIcon = icon;
    }

    public int getmIcon(){
        return mIcon;
    }

    public void setmStatue(String Statue) {
        this.mStatue = Statue;
    }

    public String getmStatue(){
        return mStatue;
    }

    public void setmLine(String line) {
        this.mLine = line;
    }

    public String getmLine(){
        return mLine;
    }

    public void setmDate(String date) {
        this.mDate = date;
    }

    public String getmDate(){
        return mDate;
    }

}
