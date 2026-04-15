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

```java
public long fatorialIterativo(int n) {
    long resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}
