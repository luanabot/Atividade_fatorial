# 📘 Fatorial em Java (Iterativo vs Recursivo)

---

## 📌 Sobre o projeto

Este projeto demonstra o cálculo do fatorial utilizando duas abordagens clássicas da programação: **iterativa** e **recursiva**.

O objetivo é facilitar a compreensão de como cada método funciona na prática, evidenciando suas diferenças em termos de execução, desempenho e uso de memória. Além disso, reforça conceitos fundamentais como laços de repetição, recursividade e resolução de problemas passo a passo.

---

## 📌 Definição de Fatorial

O fatorial de um número `n` é definido como:

n! = n × (n - 1) × (n - 2) × ... × 1

### Exemplos:
- 3! = 6
- 5! = 120
- 0! = 1

---

## 🔁 Implementação Iterativa
Na abordagem iterativa, o cálculo do fatorial é feito utilizando uma estrutura de repetição (`for`). A ideia é começar com um valor inicial e ir multiplicando sucessivamente até chegar no número desejado.

No código, a variável `resultado` é iniciada com 1 porque ela será usada como acumulador das multiplicações. Em seguida, o laço `for` começa com `int i = 2`. Isso acontece porque multiplicar por 1 não altera o resultado, então já iniciamos do 2 para otimizar o processo.

A condição `i <= n` garante que o laço será executado até o número informado pelo usuário. A cada repetição, `i` é incrementado (`i++`), fazendo com que todos os números de 2 até `n` sejam percorridos.

Dentro do laço, a operação `resultado *= i` multiplica o valor atual de `resultado` pelo valor de `i`, acumulando o resultado final. Quando o laço termina, a variável `resultado` contém o valor do fatorial e ele é retornado.

---
```java
public long fatorialIterativo(int n) {
    long resultado = 1;

    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }

    return resultado;
}
```
## 🔁 Implementação Iterativa
## 🔁 Implementação Recursiva

Na abordagem recursiva, o cálculo do fatorial é feito através de chamadas da própria função. Ou seja, a função resolve o problema chamando ela mesma com valores menores até chegar em um caso simples que encerra as chamadas.

A lógica principal é baseada na definição matemática do fatorial: `n! = n × (n - 1)!`.

No código, primeiro é definido o **caso base**, que é quando `n` é igual a 0 ou 1. Nessa situação, a função retorna 1, pois esses são os valores conhecidos do fatorial e servem para parar a recursão.

Se o caso base não for atingido, a função executa a chamada recursiva: `return n * fatorialRecursivo(n - 1)`. Isso significa que o valor atual de `n` é multiplicado pelo resultado do fatorial de `n - 1`.

Esse processo se repete até chegar no caso base. Depois disso, as chamadas começam a “voltar”, resolvendo as multiplicações passo a passo até chegar ao resultado final.
```java
public long fatorialRecursivo(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }

    return n * fatorialRecursivo(n - 1);
}
