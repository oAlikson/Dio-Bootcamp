function comparaNumeros(num1, num2) {
    if (!num1 || !num2) return 'Defina dois números diferentes de 0!';
    const primeiraFrase = criarPrimeiraFrase(num1, num2);
    const segundaFrase = criarSegundaFrase(num1, num2);

    return `${primeiraFrase}${segundaFrase}`;
}
function criarPrimeiraFrase(num1, num2) {
    let saoIguais = '';

    if (num1 !== num2) {
        saoIguais = 'Não';
    }

    return `Os números ${num1} e ${num2} ${saoIguais} são iguais. `;
}

function criarSegundaFrase(num1, num2) {
    const soma = num1 + num2;

    let resultado10 = 'Menor';
    let resultado20 = 'Menor';
    const compara10 = soma > 10;
    const compara20 = soma > 20;

    if (compara10) {
        resultado10 = 'Maior';
    }

    if (compara20) {
        resultado20 = 'Maior';
    }

    return `Sua soma é ${soma}, que é ${resultado10} que 10 e  ${resultado20} 20`;
}

console.log(comparaNumeros(1, 2));
