package id.tutorial.com.activeandroid.entity;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "inventory")
public class Inventory extends Model{

    @Column(name = "name")
    public String name;

}
