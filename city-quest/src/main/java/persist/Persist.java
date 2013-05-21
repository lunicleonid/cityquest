package persist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: lunicl
 * Date: 13/05/13
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Persist {
    @Id
    @GeneratedValue
    private long id;

    public long getId(){return this.id;}
    public void setId(long id){this.id = id;}

}
