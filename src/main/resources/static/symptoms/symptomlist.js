function row(s) {
    let line = `<td>${s.id}</td><td>${s.symptom}</td>`;
    let r = document.createElement("tr");
    r.innerHTML = line;
    return r;
}

function show_table(data){
    //fill table from JavaScript object (data)
    console.log(data);
    let symptomlist = document.getElementById("id");

    for (const s of data) {
        symptomlist.appendChild(row(s));
    }
}

function load_table() {
    // javascript fetch api
    fetch("/symptomlist/").then(function (result) { //asynchron .then() --callback
        //console.log(result);
        if (result.ok) {
            result.json().then(function (data) { //javascript object
                show_table(data);
            }); //asynchron - callback fkt.
        } else {
            console.log("error: " + result.status);
        }
    });
}

document.addEventListener("DOMContentLoaded", load_table);