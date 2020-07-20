const form = document.getElementById('body')

form.addEventListener("submit", passarToficha)


function passarToficha(event) {

    event.preventDefault()

    const curriculo = {
        nome: document.getElementById('nome').value,
        email: document.getElementById('email').value,
        tel1: document.getElementById('tel1').value,
        tel2: document.getElementById('tel2').value,
    }

    let formficha = document.getElementById('formbyscript')

    let message = '</b><i style="opacity : 0.5 "> Não informado </i></b>'

    curriculo.email == "" ? curriculo.email = message : ""
    curriculo.nome == "" ? curriculo.nome = message : ""
    curriculo.tel1 == "" ? curriculo.tel1 = message : ""
    curriculo.tel2 == "" ? curriculo.tel2 = message : ""

    let layout = `
    
        Nome completo:</br>
       <b>${curriculo.nome}</b></br></br>
        Email:</br>
        <b>${curriculo.email}</b></br></br>
        Telefone 1: </br>
        <b>${curriculo.tel1}</b></br></br>
        Telefone 2: </br>
        <b>${curriculo.tel2}</b>
    `

    formficha.innerHTML = layout
    clean()

}

function clean() {

    document.getElementById('nome').value = ""
    document.getElementById('email').value = ""
    document.getElementById('tel1').value = ""
    document.getElementById('tel2').value = ""
}