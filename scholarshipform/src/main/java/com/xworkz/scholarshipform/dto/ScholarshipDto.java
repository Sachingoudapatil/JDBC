package com.xworkz.scholarshipform.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ScholarshipDto implements Serializable{

	private String firstName;
	private String lastName;
	private  String email;
	private long phoneNo;
	private int age;
	private String address;

}
