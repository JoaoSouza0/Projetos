
function getNumber(tipo, valor) {

    if (valor == 'c') {
        document.getElementById('tela').value = ''
    }

    if (tipo == 'acao') {
        if (valor === '-' || valor === '/' || valor === '*' || valor === '+' || valor === '.') {

            document.getElementById('tela').value += valor
        } else if ( valor === '=' )
        {   
            var tela = eval(document.getElementById('tela').value)
           
            document.getElementById('tela').value = tela
        }

    } else if (tipo == 'valor') {

        document.getElementById('tela').value += valor


    }
}
