function save(){
    let vaccine = {
        series: document.getElementById("series").value,
        authority: document.getElementById("authority").value,
        doseNumber:{doseNumberString : document.getElementById("dose").value},
        targetDisease:{text : document.getElementById("desease").value,
        coding: {code:document.getElementById("code").value,display:document.getElementById("display").value}},
        seriesDoses:{seriesDosesString: document.getElementById("series").value}
    }
    console.log(vaccine)
    post(vaccine);
}
async function post(vaccine){
    const response = await  fetch("/vaccines/save",{
        method:"post",
        headers:{'Content-Type':'application/json'},
        body: JSON.stringify(vaccine)

    });
    if(response.ok){alert("vaccine saved"); window.location.href = "/doctor/vaccines"}
    else alert("Error: "+response.status);
}
