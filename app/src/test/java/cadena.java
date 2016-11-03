/**
 * Created by root on 2/11/16.
 */

public class Cadena {
    private String myCadena;

    public String getMyCadena() {
        return myCadena;
    }

    public void setMyCadena(String myCadena) {
        this.myCadena = myCadena;
    }
    private void DoSomething(String someValue){
        setMyCadena(someValue);
    }
}
