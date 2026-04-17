class Patient {
    constructor(name, age, id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

class Appointment {
    constructor(patientId, date, time, doctor) {
        this.patientId = patientId;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
    }
}

const patients = [];
const appointments = [];

function addPatient(name, age) {
    const id = patients.length + 1;
    const newPatient = new Patient(name, age, id);
    patients.push(newPatient);
    return newPatient;
}

function scheduleAppointment(patientId, date, time, doctor) {
    const newAppointment = new Appointment(patientId, date, time, doctor);
    appointments.push(newAppointment);
    return newAppointment;
}

function getPatientList() {
    return patients;
}

function getAppointmentList() {
    return appointments;
}

// Example usage
addPatient("John Doe", 30);
scheduleAppointment(1, "2026-04-18", "10:00", "Dr. Smith");
