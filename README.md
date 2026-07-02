# Comparação de Algoritmos de Ordenação (LEDA)

Atividade da disciplina de **Laboratório de Estrutura de Dados e Algoritmos (LEDA)**: implementação e comparação de desempenho de três algoritmos de ordenação clássicos.

## Sobre o projeto

O programa gera um array de números aleatórios com o tamanho informado pelo usuário e o ordena com três algoritmos, medindo e comparando para cada um:

- **Número de trocas**
- **Número de comparações**
- **Tempo de execução** (em ms)

| Algoritmo | Classe | Complexidade média |
|---|---|---|
| Bubble Sort | `BubbleSort` | O(n²) |
| Selection Sort | `SelectionSort` | O(n²) |
| Insertion Sort | `InsertionSort` | O(n²) — O(n) no melhor caso |

Ao final, é exibido um comparativo com as métricas dos três algoritmos.

📄 **Relatório da atividade**: [Google Docs](https://docs.google.com/document/d/1M30cLyg169M2vNgUkELvaIRk4m41ujlctlMBbVzaBK8/edit?usp=sharing)

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

Abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`, ou:

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

Informe a quantidade de elementos quando solicitado e acompanhe o comparativo no console.

## Testes

```bash
mvn test
```
