package id.eightstudio.www.latihanfirebase.Models;

/**
 * Created by danboru on 6/17/17.
 */

public class Pesan {

    private String pesan;
    private int timeStamp;
    private boolean isAdmin;

    public Pesan() {
    }

    public Pesan(String pesan, int timeStamp, boolean isAdmin) {
        this.pesan = pesan;
        this.timeStamp = timeStamp;
        this.isAdmin = isAdmin;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Pesan{" +
                "pesan='" + pesan + '\'' +
                ", timeStamp=" + timeStamp +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
