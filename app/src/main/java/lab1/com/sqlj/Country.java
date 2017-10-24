package lab1.com.sqlj;

/**
 * Created by Janet on 10/24/2017.
 */

public class Country{
    //private variables
    int _cid;
    String _cname;

    public Country(){}
    public Country(int id, String name){
        this._cid = id;
        this._cname = name;
    }
    public Country(String name){
        this._cname = name;
    }

    public int getCID() {
        return _cid;
    }

    public void setCID(int _cid) {
        this._cid = _cid;
    }

    public String getCName() {
        return _cname;
    }

    public void setCName(String _cname) {
        this._cname = _cname;
    }

}