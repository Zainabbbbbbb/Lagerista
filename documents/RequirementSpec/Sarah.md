# Sarah-Jessica Paukner
|Use Case number| 018                                                                                                |
|:----|----------------------------------------------------------------------------------------------------|
|Name| maintain symptom list                                                                              |
|Short description| maintain a list with symptoms                                                                      |
|Actors| Doctor                                                                                             |
|Trigger|                                                                                                    |
|Result(s)| get a list of symptoms                                                                             |
|Preconditions| be logged in as "Doctor"                                                                             |
|Incoming data| symptom id or symptom name                                                                         |
|Postconditions|                                                                                                    |
|Process description (essential action steps)|                                                                                                    |
|    • x| create symptom class                                                                               |
|    • x| get symptoms from database (symptom.sql)                                                           |
|    • x| create symptom controller (put, update, delete)                                                    |
|    • x| add endpoint in symptom contoller GET /symptomlist/get (liefert alle Symptome in der Liste zurück) |
|Error behavior| error in reading the import sql-file                                                               |
|Variations|                                                                                                    |
