from abc import ABC, abstractmethod

class FormaPagamento(ABC):
    @abstractmethod
    def processar_pagamento(self, valor: float):
        pass

class CartaoCredito(FormaPagamento):
    def processar_pagamento(self, valor: float):
        print(f"Pagamento de R${valor:.2f} processado via cartão de crédito.")

class CartaoDebito(FormaPagamento):
    def processar_pagamento(self, valor: float):
        print(f"Pagamento de R${valor:.2f} processado via cartão de débito.")

class Pix(FormaPagamento):
    def processar_pagamento(self, valor: float):
        print(f"Pagamento de R${valor:.2f} processado via Pix.")

class Pagamento:
    def __init__(self, forma_pagamento: FormaPagamento):
        self._forma_pagamento = forma_pagamento

    def processar_pagamento(self, valor: float):
        self._forma_pagamento.processar_pagamento(valor)

    def alterar_forma_pagamento(self, nova_forma_pagamento: FormaPagamento):
        self._forma_pagamento = nova_forma_pagamento

if __name__ == "__main__":
    print("Bem-vindo ao sistema de pagamento!")
    print("Por favor, escolha o método de pagamento:")
    print("1 - Cartão de Crédito")
    print("2 - Cartao de Débito")
    print("3 - Pix")
    
    opcao = input("Escolha uma opção: ")

    forma_pagamento = None
    if opcao == "1":
        forma_pagamento = CartaoCredito()
    elif opcao == "2":
        forma_pagamento = CartaoDebito()
    elif opcao == "3":
        forma_pagamento = Pix()
    else:
        print("Opção inválida. Saindo do programa.")
        exit()

    valor = float(input("Insira o valor a ser pago: R$"))

    pagamento = Pagamento(forma_pagamento)
    pagamento.processar_pagamento(valor)