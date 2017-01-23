import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class Role implements Serializable {

    private Boolean admin;
    private Boolean normal;

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getNormal() {
        return normal;
    }

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }
}
