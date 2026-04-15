# 📘 Fatorial em Java (Iterativo vs Recursivo)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![Algoritmos](https://img.shields.io/badge/Algoritmos-Fatorial-blue?style=for-the-badge)

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

```java
public long fatorialIterativo(int n) {
    long resultado = 1;

    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }

    return resultado;
}
