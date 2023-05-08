
async function save() {
    const symptom = {
        id: document.getElementById("id").value,
        symptom: document.getElementById("name").value,
    };

    const response = await fetch("/symptomlist/add", {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body : JSON.stringify(symptom)
    });

    if (response.ok) alert("Symptom saved");
    else alert("Error: "+ response.status);
}