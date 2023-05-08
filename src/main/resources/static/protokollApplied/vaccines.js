function row(data)
{
    let btr = `<td>${data.series}</td><td>${data.authority}</td><td>${data.doseNumber.doseNumberString}</td><td>${data.targetDisease.text}</td><td>${data.targetDisease.coding.code}</td><td>${data.targetDisease.coding.display}</td><td>${data.seriesDoses.seriesDosesString}</td>`;
    let r = document.createElement("tr");
    r.innerHTML = btr;
    return r;
}

function show_table(data){
    console.log(data)
    let vaccinelist = document.getElementById("vaccinelist");
    for (const d of data) {
        let r= row(d);
        vaccinelist.appendChild(r);
    };     //fill table from JavaScript
}


function load_table(){
    fetch("/vaccines/all").then(function (result) {
        console.log(result);
        if (result.ok){
            result.json().then(function (data){
                show_table(data);
            });

        }else {
            console.log("Error: "+result.status);
        }
    })

}
document.addEventListener("DOMContentLoaded", load_table);
