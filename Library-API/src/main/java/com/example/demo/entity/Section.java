package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Entity(name = "tb_section")
@ToString(includeFieldNames = true)
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = false)
	Long id;

	@Column(name = "section_name")
	String sectionName;
	@Column(name = "is_veg")
	boolean isVeg;
	@Column(name = "created_by")
	String createdby;
	@Column(name = "created_on")
	String createdon;
	@Column(name = "updated_by")
	String updatedby;
	@Column(name = "updated_on")
	String updatedon;
	@Column(name = "is_active")
	boolean isActive;
	

}
