/**
 * Created: 2022-12-10
 * Author: Rudolf Radlbauer
 */
package at.spengergasse.med_px.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * entity class for roles - there is a N:M relationship with users
 */
@Entity
@Table(name = "roles")
public class Role {
    @Id
    private String name;
    private String description;
//    @ManyToMany
//    private List<MedUser> users;


    public String getName() {
        return name;
    }
}
