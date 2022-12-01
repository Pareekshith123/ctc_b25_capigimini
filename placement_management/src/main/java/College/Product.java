package College;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Product
{
	//creating id ,collegeadmin,collegename,location for each student
private Integer id;
private String collegeadmin;
private String collegename;
private String location;

public Product()
{
}
//constuctor using instace vaiable parameter
public Product(Integer id, String collegeadmin, String collegename,String location)
{
this.id = id;
this.collegeadmin = collegeadmin;
this.collegename= collegename;
this.location= location;
}
//Id anottation
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//get id method
public Integer getId()
{
return id;
}
//setid method
public void setId(Integer id)
{
this.id = id;
}
//getcollegeadmin method
public String getcollegeadmin()
{
return collegeadmin;
}
//setcollegeadmin method
public void setcollegeadmin(String collegeadmin)
{
this.collegeadmin = collegeadmin;
}
//getcollegename method
public String getcollegename()
{
return collegename;
}
//setcollegename method
public void setcollegename(String collegename)
{
this.collegename= collegename;

}
//getlocation method
public String  getlocation()
{
return location;
}
// setlocation method
public void setlocation(String  location)
{
this. location= location;
}


@Override
public String toString()
{
return "Product [id=" + id + ", collegeadmin=" +collegeadmin+ ", collegename=" + collegename + ", location=" +location + "]";
}
}

