Healthcare Management System - PHP Project
Description
This project is a Healthcare Management System built using PHP, MySQL, HTML, CSS, and JavaScript. It is designed to streamline hospital operations by managing patient records, doctor appointments, medical histories, and administrative tasks efficiently.

Key Features:
User Authentication: Secure login for Admin, Doctors, and Patients.

Patient Management: Add, view, update, and delete patient records.

Appointment Scheduling: Patients can book appointments with doctors.

Doctor Dashboard: Doctors can view appointments, update patient status, and manage prescriptions.

Admin Panel: Manage users, departments, and hospital analytics.

Responsive Design: Works on desktop, tablet, and mobile devices.

Technologies Used
Frontend: HTML, CSS, Bootstrap, JavaScript

Backend: PHP

Database: MySQL

Server: XAMPP / WAMP / LAMP

How to Set Up the Project
1. Clone the Repository
bash
git clone https://github.com/your-username/healthcare-management-system.git
cd healthcare-management-system
2. Database Setup
Import the SQL file (database/healthcare_db.sql) into phpMyAdmin.

Update database credentials in includes/config.php.

3. Run the Project
Place the project folder in htdocs (XAMPP) or www (WAMP).

Start Apache & MySQL in XAMPP/WAMP.

Open in browser:

http://localhost/healthcare-management-system

---------------------------------------------------------------
Default Login Credentials
username : AmitPatel
email : AmitPatel@gmail.com
password : AmitPatel

username : SunitaSharma
email : SunitaSharma@gmail.com
password : SunitaSharma

--------Admin credentials-----------------

adminName : admin
email : admin@gmail.com
password : admin

--------Doctor credentials-----------------

doctorName : Amit Patel
email : AmitPatel@gmail.com
password : Amit Patel

doctorName : Rajesh Kumar
email : RajeshKumar@gmail.com
password : Rajesh Kumar

==============================================================

Project Structure
healthcare-management-system/  
├── assets/          # CSS, JS, Images  
├── database/        # SQL files  
├── includes/        # Config & functions  
├── admin/           # Admin panel  
├── doctor/          # Doctor dashboard  
├── patient/         # Patient portal  
├── index.php        # Homepage  
└── README.md        # Project documentation  
