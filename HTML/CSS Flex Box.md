# Introdução ao Flex Box


1. Conhecer estrutura básica

2. Entender a diferença entre Flex Container e Flex Item

3. Conhecer inicialmente algumas propriedades

Ele foi projetado como um modelo de layout unidimensional e como um método que pode oferecer distribuição de espaço entre itens em uma interface e recursos de alinhamento.

Flex Container ele é a tag que envolve os itens, será nela que iremos aplicar a propriedade “dislpay:flex”. Transforma todos os seus itens filhos em flex itens.

**Flex Container** são propriedades relacionadas:

·     Display

·     Fex-direction

·     Flex-wrap

·     Flex-flow

·     Justify-content

·     Align-itens

·     Align-content

**Flex Iten** são os elementos diretos do Flex Container. E também podem se tornar Flex Container.

**Fundamentos**

**Display Flex** Torna a tag um elemento do tipo flex container, e assim automaticamente todos os seus filhos diretos desta tag, torna-se em flex itens.

​                               

**Estrutura básica de flex Direction**

·     Row (padrão): á direção do texto, esquerda para direita.

·     Row-reverse: sentido oposto ao Row.

·     Column: ordenação de cima para baixo, em coluna única.

·     Column-reverse: ordenação de baixo pra cima.

 

 

 

**Flex-wrap** é a propriedade que define se os itens devem ou não quebrar a linha.

·     Nowrap: é o padrão, não permite quebra de linha. Deixa elementos vazando.

·     Wrap: permite a quebra de linha assim que um dos flex itens não puder mais ser compactado. Não permite vazamento.

·     Wrap-reverse: permite a quebra de linha no sentido contrário.

 

**Flex-Flow** é um atalho pra as propriedades flex-direction e flex-wrap.

Porem seu uso não é muito comum, visto que quando mudamos o flex-direction para Column, mantemos o padrão flex wrap que é nowrap.

**Estrutura Justify content:** Essa propriedade vai se encarregar de alinhar os itens dentro do container de acordo com a direção pretendida e tratar da distribuição de espaçamento entre eles.

**OBS:** caso seus itens estejam ocupando 100% de todo o container, ela não se aplica.

Variações:

·     **Flex start:** inicio do container.

·     **Flex end:** final do container.

·     **Center:** centro do container.

·     **Space between:** cria um espaço igual entre os elementos.

·     **Space around:** os espaçamentos do meio são duas vezes maiores que o inicial e final.

 

**Estrutura Align itens:** Trata do alinhamento de itens de acordo com o eixo do container.
 O alinhamento é diferente para quando os itens estão em colunas ou linhas.
 Permite o alinhamento central no eixo vertical.

**Tipos de alinhamentos**

·     **Center:** ao centro.

·     **Stretch:** padrão, e o flex itens cresçam igualmente.

·     **Flex-start:** alinhamento dos itens no início.

·     **Flex-end:** alinhamento dos itens no final.

**Estrutura Align Content:** é a propriedade responsável por tratar o alinhamento das linhas do container em relação ao eixo vertical do container.

Precisamos que o container utilize quebra de linhas (precisa que o container tenha o flex-wrap com o modo wrap), e a altura do container seja maior que a soma das linhas dos itens.

**Tipos de alinhamento**

·     **Center:** ao centro.

·     **Stretch:** padrão, e o flex itens cresçam igualmente.

·     **Flex-start:** alinhamento dos itens no início.

·     **Flex-end:** alinhamento dos itens no final.

·     **Space between:** cria um espaço igual entre os elementos.

·     **Space around:** os espaçamentos do meio são duas vezes maiores que o inicial e final.

**Estrutura Flex Grow:** Define a proporcionalidade de crescimentos dos itens, respeitando o tamanho de seus conteúdos internos.
 **OBS:** não irá funcionar caso tenhamos adicionado Justify-content ao nosso flex container.

 

**Estrutura Flex Basis:** É a propriedade que estabelece o tamanho inicial do item antes das distribuições de espaço restante dentro dele, usando como base o conteúdo interno disposto.

Valores possíveis

·     **Auto:** caso o item não tenha tamanho, este será proporcional ao conteúdo do item.

·     **Px, %, em...:** São valores exatos previamente definidos.

·     **0 (zero):** terá relação com a definição flex-grow.

 

**Estrutura Flex Shrink:** É a propriedade que estabelece a capacidade de redução ou compressão do tamanho de um item.

**Estrutura Flex** Essa propriedade é um atalho ou abreviação de escrita para as propriedades: Grow, Shrink e Basis. Ou seja, usando apenas o Flex: 1 seria a mesma coisa que ter um Grow = 1, Shrink= 1, Basis = 0;

**Estrutura Order:** É a propriedade vai lidar diretamente com a ordenação aos itens.

**Estrutura Align-Self:** É a propriedade que estabelece o alinhamento de mofo individual sobre um determinado item.

**Valores possíveis:**

·     **Auto:** Valor padrão.

·     **Flex-start:** Início.

·     **Flex-end:** Final.

·     **Center:** Centro.

·     **Stretch:** Ocupa todo espaço.

·     **Baseline:** Utiliza a linha base da tipologia.

 
