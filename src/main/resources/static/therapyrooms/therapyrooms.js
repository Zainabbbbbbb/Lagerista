async function save()
{
    const therapy={
        raumname : document.getElementById("raumname").value,
        raumgroese : parseInt(document.getElementById("raumgroese").value),
        sonstiges : document.getElementById("sonstiges").value
    };

    const response= await fetch("/api/posttherapy", {
        method : "POST",
        headers: { 'Content-Type' : 'application/json'},
        body: JSON.stringify(therapy)
    });

    if (response.ok) document.location.reload();
    else alert ("Error: "+response.status);
}

async function deleteUser(mname){
    const response = await fetch("/api/admin/users/delete/" + uname, {
        method : "delete"
    });
    if (!response.ok){alert("error deleting user: " + response.status)}
    window.location.reload();
}

function row  (data) {
    let btr = `<td>${data.raumname}</td><td>${data.raumgroese}</td><td>${data.sonstiges}</td>`;
    let r = document.createElement("tr");
    r.innerHTML=btr;
    return r;
};

function show_table(data){
    let tbody = document.getElementById("therapy_list");
    for (let b of data)
    {
        let r = row(b);
        tbody.appendChild(r);
    }
}

function load_table() {
    fetch("/api/gettherapy").then( function (result) {
        //console.log(result);
        if (result.ok) {
            result.json().then(function (data) {
                show_table(data);
            })
        } else {console.log("error: " + result.status);}
    });
}

document.addEventListener("DOMContentLoaded", load_table);
