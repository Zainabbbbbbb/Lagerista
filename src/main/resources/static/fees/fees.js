function row(c) {
    let line = `<td>${c.id}</td><td>${c.sub}</td><td>${c.occ}</td><td>${c.ser}</td><td>${c.qua}</td>`;
    let t= document.createElement("tr");
    t.innerHTML=line;
    return t;
}

function show_table(data) {
    console.log(data);

    let tb=document.getElementById("id");
    for (const c of data) {

        tb.appendChild(row(c));

        //let tr = document.createElement("tr");
        // tr.innerHTML = `<td>${c.id}</td><td>${c.sub}</td><td>${c.occ}</td><td>${c.ser}</td><td>${c.qua}</td>`;
        // tb.appendChild(tr);

    }
}
function load(){
    fetch("/fees").then(function(result){
        console.log(result);
        if(result.ok){
            result.json().then(function(data){
                console.log(data);
                show_table(data);
            });
        }else{
            console.log("error: "+result.status);
        }
    });

}
