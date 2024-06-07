package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity(name = "tb_variable")
public class Variables {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@ManyToOne
    @JoinColumn(name = "section_id")
	public Section sectionid;
	@Column(name = "name")
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
