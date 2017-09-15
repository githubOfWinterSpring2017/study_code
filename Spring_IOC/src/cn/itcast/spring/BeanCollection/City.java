package cn.itcast.spring.BeanCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class City {

	private List<String> names;
	private Set<String> roads;
	private Map<String,String> cars;
	private Properties properties;
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<String> getRoads() {
		return roads;
	}
	public void setRoads(Set<String> roads) {
		this.roads = roads;
	}
	public Map<String, String> getCars() {
		return cars;
	}
	public void setCars(Map<String, String> cars) {
		this.cars = cars;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "City [names=" + names + ", roads=" + roads + ", cars=" + cars + ", properties=" + properties + "]";
	}
	
	
	
}
