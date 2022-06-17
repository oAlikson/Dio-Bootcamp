# Introdução ao JavaScript
## JAVASCRIPT

**Objetivos**

**1.**   **Entender a história da linguagem**

**2.**   **Familiarizar-se com a sintaxe**

**3.**   **Utilização de recursos básicos**

**4.**   **Criar seu primeiro projeto**

**5.**   **Conhecer possibilidades no mercado de trabalho**

**Aplicações**

·    **Web**

·    **Mobile**

·    **Smartwatches**

·    **Games**

·    **Internet of Things**

·    **APIs**

 

**Recursos básicos da Linguagem**

**Recursos básicos**

Para comentar o código usa o // para uma linha e /* */ para varias linhas. Se apertar “**ctrl + /**” e se quiser comentar varias linhas é só selecionar as linhas e dar o comando.

Em JavaScript temos o termo variável representado por **“var”**, como o nome diz ele pode ser variado.
 e temos a constante representado por **“const”**, onde não é possível alterar o valor pois como o nome diz é constante. Como boa pratica para leitura de código ao usar uma constante coloca o nome dela em letras maiúsculas.

 

**Funções**

Para declarar uma função usa-se a expressão “function” e em seguida dá o nome dela ex: fuction soma (a + b) { 
 aí você pode usar 2 opções para mostrar o valor o console.log () para mostrar o valor no console ou o return para que ele retorne o valor. Para chamar a função você digita o nome dela ex: soma (3, 5).

**Console**

**Executando um arquivo .js**

 

**JavaScript em uma página da web**

Para rodar o console é necessário que você instale o Node.js na sua máquina, no vscode para que tenha a saída no console é necessário que use o comando console.log e depois no terminal digite node e o nome do arquivo que quer rodar, ex:

Crie um arquivo com nome teste.js

No vscode digite:

console.log (“Olá Mundo!”)

e no terminal:

node teste.js

Assim irá aparecer a mensagem de Olá Mundo! No seu terminal.
 Lembrando que o seu terminal precisa estar na pasta que o arquivo está salvo.

 

**Estrutura de projeto** É comum em projetos separar os arquivos por pastas, css, js e no html criar um arquivo index e deixar ele separado das outras pastas.

**Inserindo JavaScript em uma página HTML** digite o código 

script *src*="./assets/js/scripts.js"/script

 

**Interagindo com elementos DOM** Ele mostra tudo o que tem disponível naquele documento, ou seja, a estrutura de elementos dentro da janela.

Para trocarmos a cor de uma fonte.

Abra a página clique com o direito e vá em inspecionar, em seguida console e digite:

document .getElementsByTagName('h1')

var heading1 = document.getElementsByTagName('h1')[0]

heading1

<h1Olá, Mundo!/h1>

heading1.style.color = 'red'

'red'







