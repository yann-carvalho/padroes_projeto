class EstrategiaTemperatura {
    async obterTemperatura(cidade) {
        throw new Error('Este método deve ser implementado pelas subclasses');
    }
}

class EstrategiaOpenWeatherMap extends EstrategiaTemperatura {
    constructor(apiKey) {
        super();
        this.apiKey = apiKey;
    }

    async obterTemperatura(cidade) {
        const url = `http://api.openweathermap.org/data/2.5/weather?q=${cidade}&appid=${this.apiKey}&units=metric`;
        const response = await fetch(url);
        const data = await response.json();

        if (response.ok) {
            const temperatura = data.main.temp;
            return temperatura;
        } else {
            console.error(`Erro ao obter dados da cidade ${cidade}: ${data.message || 'Erro desconhecido'}`);
            return null;
        }
    }
}

class ServicoDeTemperatura {
    constructor(estrategia) {
        this.estrategia = estrategia;
    }

    definirEstrategia(estrategia) {
        this.estrategia = estrategia;
    }

    async obterTemperatura(cidade) {
        return await this.estrategia.obterTemperatura(cidade);
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const apiKey = "f50240869ab9e8c2545f6c41145d54d2";
    const estrategia = new EstrategiaOpenWeatherMap(apiKey);
    const servico = new ServicoDeTemperatura(estrategia);

    const cidadeInput = document.getElementById('cidade');
    const buscarButton = document.getElementById('buscar');
    const resultado = document.getElementById('resultado');

    buscarButton.addEventListener('click', async () => {
        const cidade = cidadeInput.value.trim();
        if (cidade) {
            const temperatura = await servico.obterTemperatura(cidade);
            if (temperatura !== null) {
                resultado.textContent = `A temperatura atual em ${cidade} é ${temperatura.toFixed(1)}°C`;
            } else {
                resultado.textContent = 'Não foi possível obter a temperatura pois esse não um nome de uma cidade.';
            }
        } else {
            resultado.textContent = 'Por favor, insira o nome de uma cidade.';
        }
    });
});