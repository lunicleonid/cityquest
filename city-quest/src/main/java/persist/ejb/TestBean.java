package persist.ejb;

import ejb.TestEJB;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class TestBean implements Serializable{
    @EJB
    private TestEJB testEJB;



    private String test="default";
    private String count="0";

    public String getTest(){
        return test;
    }

    public void setTest(String test){
        this.test = test;
        try {
            int i = Integer.parseInt(test);
            i = testEJB.increment(i);
            this.test = "Incremented = " + i;
        }catch (NumberFormatException e){

        }
    }

    public String getCount(){
        return String.valueOf(testEJB.countSavedInstances());
    }


}
