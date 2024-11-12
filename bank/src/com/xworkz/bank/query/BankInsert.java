package com.xworkz.bank.query;

public class BankInsert {

	
	
	public String getInsertQuery() {
		String insertQuery="INSERT INTO bank_table VALUES(1, 'Amit Sharma', 'amit.sharma@example.com', 'password123', '919876543210', '123 Main St, New Delhi', 'ACC1234567890', 'Savings', 50000.00, 'New Delhi Branch', 'IFSC001', '2022-01-01'),"+
				"(2, 'Ravi Kumar', 'ravi.kumar@example.com', 'password123', '919876543211', '456 Oak St, Mumbai', 'ACC1234567891', 'Checking', 75000.00, 'Mumbai Branch', 'IFSC002', '2022-02-01'),"+
				"(3, 'Sneha Patel', 'sneha.patel@example.com', 'password123', '919876543212', '789 Pine St, Ahmedabad', 'ACC1234567892', 'Savings', 60000.00, 'Ahmedabad Branch', 'IFSC003', '2022-03-01'),"+
				"(4, 'Pooja Singh', 'pooja.singh@example.com', 'password123', '919876543213', '101 Maple St, Kolkata', 'ACC1234567893', 'Checking', 80000.00, 'Kolkata Branch', 'IFSC004', '2022-04-01'),"+
				"(5, 'Rohan Verma', 'rohan.verma@example.com', 'password123', '919876543214', '202 Birch St, Bengaluru', 'ACC1234567894', 'Savings', 90000.00, 'Bengaluru Branch', 'IFSC005', '2022-05-01'),"+
				"(6, 'Nisha Gupta', 'nisha.gupta@example.com', 'password123', '919876543215', '303 Cedar St, Hyderabad', 'ACC1234567895', 'Checking', 45000.00, 'Hyderabad Branch', 'IFSC006', '2022-06-01'),"+
				"(7, 'Vikram Desai', 'vikram.desai@example.com', 'password123', '919876543216', '404 Elm St, Pune', 'ACC1234567896', 'Savings', 70000.00, 'Pune Branch', 'IFSC007', '2022-07-01'),"+
				"(8, 'Anjali Jain', 'anjali.jain@example.com', 'password123', '919876543217', '505 Spruce St, Jaipur', 'ACC1234567897', 'Checking', 65000.00, 'Jaipur Branch', 'IFSC008', '2022-08-01'),"+
				"(9, 'Karan Mehta', 'karan.mehta@example.com', 'password123', '919876543218', '606 Redwood St, Lucknow', 'ACC1234567898', 'Savings', 75000.00, 'Lucknow Branch', 'IFSC009', '2022-09-01'),"+
				"(10, 'Priya Rao', 'priya.rao@example.com', 'password123', '919876543219', '707 Fir St, Chennai', 'ACC1234567899', 'Checking', 50000.00, 'Chennai Branch', 'IFSC010', '2022-10-01'),"+
				"(11, 'Ajay Nair', 'ajay.nair@example.com', 'password123', '919876543220', '808 Willow St, Cochin', 'ACC1234567810', 'Savings', 85000.00, 'Cochin Branch', 'IFSC011', '2022-11-01'),"+
				"(12, 'Sanya Kapoor', 'sanya.kapoor@example.com', 'password123', '919876543221', '909 Hemlock St, Chandigarh', 'ACC1234567811', 'Checking', 55000.00, 'Chandigarh Branch', 'IFSC012', '2022-12-01'),"+
				"(13, 'Manish Joshi', 'manish.joshi@example.com', 'password123', '919876543222', '1010 Ash St, Nagpur', 'ACC1234567812', 'Savings', 60000.00, 'Nagpur Branch', 'IFSC013', '2023-01-01'),"+
				"(14, 'Geeta Reddy', 'geeta.reddy@example.com', 'password123', '919876543223', '1111 Cedar St, Visakhapatnam', 'ACC1234567813', 'Checking', 70000.00, 'Visakhapatnam Branch', 'IFSC014', '2023-02-01'),"+
				"(15, 'Rakesh Aggarwal', 'rakesh.aggarwal@example.com', 'password123', '919876543224', '1212 Birch St, Surat', 'ACC1234567814', 'Savings', 90000.00, 'Surat Branch', 'IFSC015', '2023-03-01'),"+
				"(16, 'Divya Sethi', 'divya.sethi@example.com', 'password123', '919876543225', '1313 Elm St, Bhopal', 'ACC1234567815', 'Checking', 55000.00, 'Bhopal Branch', 'IFSC016', '2023-04-01'),"+
				"(17, 'Arun Bhatt', 'arun.bhatt@example.com', 'password123', '919876543226', '1414 Spruce St, Thiruvananthapuram', 'ACC1234567816', 'Savings', 75000.00, 'Thiruvananthapuram Branch', 'IFSC017', '2023-05-01'),"+
				"(18, 'Meera Iyer', 'meera.iyer@example.com', 'password123', '919876543227', '1515 Redwood St, Indore', 'ACC1234567817', 'Checking', 65000.00, 'Indore Branch', 'IFSC018', '2023-06-01'),"+
				"(19, 'Rajiv Dubey', 'rajiv.dubey@example.com', 'password123', '919876543228', '1616 Fir St, Patna', 'ACC1234567818', 'Savings', 85000.00, 'Patna Branch', 'IFSC019', '2023-07-01'),"+
				"(20, 'Kavita Sen', 'kavita.sen@example.com', 'password123', '919876543229', '1717 Willow St, Agra', 'ACC1234567819', 'Checking', 70000.00, 'Agra Branch', 'IFSC020','2023-08-01')";
				
		return insertQuery;
	}
}