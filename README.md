# Banco AspectJ

Este projeto simula um banco simples utilizando **AspectJ** para aplicar aspectos relacionados à verificação de saldo antes da realização de um saque.

## Objetivo

O objetivo deste projeto é demonstrar o uso do **AspectJ** para interceptar e modificar o comportamento de métodos de uma aplicação Java. No caso deste projeto, o aspecto verifica se há saldo suficiente na conta antes de permitir a realização de um saque.

## Funcionalidades

- **Verificação de saldo antes do saque**: O aspecto `VerificacaoSaldoAspect` intercepta o método `sacar` da classe `Conta` para garantir que o saldo seja suficiente para o valor do saque.
- **Banco simulado**: Um banco simples é simulado utilizando a classe `Conta` e a classe `VerificacaoSaldoAspect` que valida se o saque é possível.

