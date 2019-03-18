package com.rana.springbootstarter.spring.Boot.Practice;

import org.springframework.stereotype.Component;

@Component
public class Details {
	
	private Integer id;
	private String Name;
	private Double Marks;
	
	
	public Details() {
		super();
	}

	public Details(Integer id, String name, Double marks) {
		super();
		this.id = id;
		Name = name;
		Marks = marks;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getMarks() {
		return Marks;
	}
	public void setMarks(Double marks) {
		Marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Marks == null) ? 0 : Marks.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Details other = (Details) obj;
		if (Marks == null) {
			if (other.Marks != null)
				return false;
		} else if (!Marks.equals(other.Marks))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	
	
	

}
