package cn.itcast.spring.SpringJDBCIOCCRUD;


/**		
 * ƒ£–Õ¿‡
 * Description TODO
 * @author ¿Ë∑…∫Ï
 * @Date Sep 12, 2017
 *
 */
public class User {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+id+"  "+name+"]" ;
	}
	
}
