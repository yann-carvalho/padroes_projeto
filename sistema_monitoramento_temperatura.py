from abc import ABC, abstractmethod
import requests

class EstrategiaTemperatura(ABC):
    @abstractmethod
    def obter_temperatura(self, cidade: str) -> float:
        pass

class EstrategiaOpenWeatherMap(EstrategiaTemperatura):
    def __init__(self, api_key: str):
        self.api_key = api_key

    def obter_temperatura(self, cidade: str) -> float:
        url = f"http://api.openweathermap.org/data/2.5/weather?q={cidade}&appid={self.api_key}&units=metric"
        response = requests.get(url)
        data = response.json()

        if response.status_code == 200:
            temperatura = data['main']['temp']
            return temperatura
        else:
            print(f"Erro ao obter dados da cidade {cidade}: {data.get('message', 'Erro desconhecido')}")
            exit()

class ServicoDeTemperatura:
    def __init__(self, estrategia: EstrategiaTemperatura):
        self.estrategia = estrategia

    def definir_estrategia(self, estrategia: EstrategiaTemperatura):
        self.estrategia = estrategia

    def obter_temperatura(self, cidade: str) -> float:
        return self.estrategia.obter_temperatura(cidade)

if __name__ == "__main__":
    api_key = "f50240869ab9e8c2545f6c41145d54d2"

    estrategia = EstrategiaOpenWeatherMap(api_key)

    servico = ServicoDeTemperatura(estrategia)

    cidade = input("Digite o nome da cidade para obter a temperatura: ")
    temperatura = servico.obter_temperatura(cidade)
    print(f"A temperatura atual em {cidade} é {temperatura:.1f}°C")
