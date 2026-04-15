# 📘 Fatorial em Java (Iterativo vs Recursivo)

## 📌 Definição
O fatorial de um número `n` é:

n! = n × (n - 1) × ... × 1

Exemplos:
- 3! = 6
- 5! = 120
- 0! = 1

---

## 🔁 Iterativo

``java
public long fatorialIterativo(int n) {
    long resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}
Este projeto demonstra o cálculo do fatorial utilizando duas abordagens clássicas da programação: iterativa e recursiva. O objetivo é facilitar a compreensão de como cada método funciona na prática, evidenciando suas diferenças em termos de execução, desempenho e uso de memória. Além disso, reforça conceitos fundamentais como laços de repetição, recursividade e resolução de problemas passo a passo.
