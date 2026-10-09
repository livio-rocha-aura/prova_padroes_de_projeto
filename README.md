# prova_padroes_de_projeto

Projeto Java simples para simular o pagamento de motoristas de uma plataforma de corridas.

## Estrutura

- `src/Motorista.java`: classe abstrata com os dados e comportamentos comuns.
- `src/MotoristaIniciante.java`: desconto de 25% e taxa de inatividade.
- `src/MotoristaPremium.java`: desconto de 15% e bônus de R$ 2,00 em cada corrida.
- `src/MotoristaParceiroFrotista.java`: desconto de 20% e aluguel fixo do veículo.
- `src/Main.java`: cria os motoristas, registra corridas e imprime os extratos.

## Como executar

```bash
mkdir -p out
javac -d out src/*.java
java -cp out Main
```
