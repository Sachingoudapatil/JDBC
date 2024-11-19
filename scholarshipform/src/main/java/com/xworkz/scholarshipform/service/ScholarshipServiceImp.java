package com.xworkz.scholarshipform.service;

import com.xworkz.scholarshipform.dto.ScholarshipDto;
import com.xworkz.scholarshipform.repo.ScholarshipRepository;
import com.xworkz.scholarshipform.repo.ScholarshipRepositoryImp;

public class ScholarshipServiceImp implements ScholarshipService{

	@Override
	public boolean validate(ScholarshipDto scholarshipDto) {
		
		boolean valid = true;
		if (scholarshipDto != null) {
			System.out.println("ScholarshipDto is not null");
			String firstName = scholarshipDto.getFirstName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(scholarshipDto.getPhoneNo());
			if (phoneNo != null && phoneNo.length() == 10 && phoneNo.startsWith("9")) {
				System.out.println("Phone No is valid");
			} else {
				valid = false;
				System.err.println("Phone No is Not valid");
			}
			int age = scholarshipDto.getAge();
			if (age > 5) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = scholarshipDto.getEmail();
			if (email != null && Character.isUpperCase(email.charAt(0)) && email.length() > 8
					&& email.charAt(7) == '@') {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				ScholarshipRepository studentRepositoryImp = new ScholarshipRepositoryImp();
			studentRepositoryImp.save(scholarshipDto);
			}
		}

		return valid;
	}

}
	
