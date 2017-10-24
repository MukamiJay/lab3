package lab1.com.sqlj;

/**
 * Created by  Janet on 10/24/2017.
 */

public class Contacts {
    //private variables
    int _id;
    String _fname;
    String _lname;

    public Contacts(){}
    public Contacts(int id, String fname, String lname){
        this._id = id;
        this._fname = fname;
        this._lname = lname;
    }
    public Contacts(String fname, String lname){
        this._fname = fname;
        this._lname = lname;
    }

    public int getID() {
        return _id;
    }

    public void setID(int _id) {
        this._id = _id;
    }

    public String getFname() {
        return _fname;
    }

    public void setFname(String _fname) {
        this._fname = _fname;
    }

    public String getLname() {
        return _lname;
    }

    public void setLname(String _lname) {
        this._lname = _lname;
    }
}
