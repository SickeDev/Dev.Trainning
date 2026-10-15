# Python — Threads e Lock

## O que aprendi hoje

Hoje estudei um pouco sobre threads em Python e como elas podem trabalhar usando a mesma variável.

Fiz um exemplo com duas threads somando valores em um contador.

### O que entendi

- **Thread:** executa uma tarefa dentro do programa.
- **Contador:** variável que as duas threads modificam.
- **Lock:** evita que duas threads acessem ao mesmo tempo o trecho protegido.
- **start():** inicia a thread.
- **join():** espera a thread terminar.

Usei o `Lock` para proteger a soma do contador. Como cada thread soma 1000 vezes, o resultado final é 2000.

Ainda estou aprendendo sobre concorrência e quero praticar mais exemplos para entender melhor como funciona.

**Tecnologia:** Python  
**Data:** 15/10/2026
