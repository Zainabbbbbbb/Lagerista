# APIS - Arztpraxisinformationssystem


## Aufgabe
Ziel dieser Gruppenaufgabe ist es ein Arztpraxisinformationssystem zu entwickeln. Es sollen folgende Funktionalitäten umgesetzt werden:
 - Register a patient
 - Define time slots for appointments
 - Assign appointment to a patient
 - Record patient consultation
 - Record anamnesis
 - Write a prescription
 - Assign to a specialist
 - Assign a diagnosis
 - Assign a therapy
 - Record a patient’s vaccinations
 - Administration of medical fees
 - Administration of medical documents
 - Maintain a list of medications
 - Maintain a list of vaccinates
 - Maintain list of symptoms
 - Maintain list of diseases (ICD)
 - Maintain list of possible therapies
 - Maintain therapy rooms
 - Maintain pricing list
 - Maintain employees
 - Maintain social insurance agencies

Die Daten sollen standardisiert im FHIR-Format vorliegen, dazu sollen (zumindest) folgende FHIR-Ressourcen verwendet werden: 

 - Patient
 - Pracitionoer
 - CareTeam
 - Consent
 - Medication
 - ImagingStudy
 - CarePlan
 - Appointment
 - Task
 - FamilyHisotry
 - Observation
 - Report
 - Coverage
 - Schedule
 - Account
 - Invoice
 - Organization

## Organisation

Jeder der eine Teilaufgabe übernimmt soll diese getrennt von den anderen Aufgaben in einem Branch umsetzen. Wenn die Aufgabe fertig und getestet ist kann sie mit einem `Pull Request` welcher von mindestens 2 Kollegen bestätigt werden muss wieder in den `main`-Branch gemerged werden. 

Die Branchnamen sollen im Format `entity/<name>` bzw. `task/<task-name>` vorliegen. Auch können eigene Kategorien wie `bugfix/<bugname>` verwendet werden. 

Für die Aufgaben müssen großteils die Controller, für die FHIR-Ressourcen großteils die Entity bzw. Modelklassen angepasst werden. 

Im Ordner `documents/RequirementSpec` sind die Aufgabenstelltungen für jeden Schüler aufgelistet. 