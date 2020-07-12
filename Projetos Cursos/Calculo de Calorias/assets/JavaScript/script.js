const form = document.getElementById('form')

form.addEventListener('submit', makeThings)

function makeThings(event) {

    event.preventDefault()

    var sexo = getSelect('gender')
    var idade = makeNumber('age')
    var peso = makeNumber('weight')
    var altura = makeNumber('height')
    var atividade = Number(getSelect('activity_level'))


    var tmb = (sexo === 'famale'
        ? (655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade))
        : (65 + (13.7 * peso) + (5 * altura) - (6.8 * idade)))

    var manutencao = Math.round(tmb * Number(atividade));
    var perdePeso = manutencao - 450
    var ganhaPeso = manutencao + 450

    var layout = ` <ul>
    <li>
      Seu metabolismo basal é de <strong>${tmb} calorias</strong>.
    </li>
    <li>
      Para manter o seu peso você precisa consumir em média <strong>${manutencao} calorias</strong>.
    </li>
    <li>
      Para perder peso você precisa consumir em média <strong>${perdePeso} calorias</strong>.
    </li>
    <li>
      Para ganhar peso você precisa consumir em média <strong>${ganhaPeso} calorias</strong>.
    </li>
  </ul>`

    var result = document.getElementById('result')
    result.innerHTML = layout

}

function getSelect(id) {

    var select = document.getElementById(id)
    return select.options[select.selectedIndex].value

}
function makeNumber(id) {

    return Number(document.getElementById(id).value)
}

