from abc import ABC, abstractmethod

class Notificacao(ABC):
    @abstractmethod
    def enviar(self, mensagem: str):
        pass

class NotificacaoFactory(ABC):
    @abstractmethod
    def criar_notificacao(self) -> Notificacao:
        pass

class EmailNotificacao(Notificacao):
    def enviar(self, mensagem: str):
        print(f"Enviando Email: {mensagem}")

class SMSNotificacao(Notificacao):
    def enviar(self, mensagem: str):
        print(f"Enviando SMS: {mensagem}")

class EmailNotificacaoFactory(NotificacaoFactory):
    def criar_notificacao(self) -> Notificacao:
        return EmailNotificacao()

class SMSNotificacaoFactory(NotificacaoFactory):
    def criar_notificacao(self) -> Notificacao:
        return SMSNotificacao()

def enviar_notificacao(factory: NotificacaoFactory, mensagem: str):
    notificacao = factory.criar_notificacao()
    notificacao.enviar(mensagem)

if __name__ == "__main__":
    # Criar fábrica de notificações por email
    email_factory = EmailNotificacaoFactory()
    enviar_notificacao(email_factory, "Olá, esta é uma notificação por email!")

    # Criar fábrica de notificações por SMS
    sms_factory = SMSNotificacaoFactory()
    enviar_notificacao(sms_factory, "Olá, esta é uma notificação por SMS!")