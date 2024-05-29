from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, temperature: float):
        pass

class Subject(ABC):
    @abstractmethod
    def register_observer(self, observer: Observer):
        pass

    @abstractmethod
    def remove_observer(self, observer: Observer):
        pass

    @abstractmethod
    def notify_observers(self):
        pass

class TemperatureSensor(Subject):
    def __init__(self):
        self._observers = []
        self._temperature = None

    def register_observer(self, observer: Observer):
        self._observers.append(observer)

    def remove_observer(self, observer: Observer):
        self._observers.remove(observer)

    def notify_observers(self):
        for observer in self._observers:
            observer.update(self._temperature)

    def set_temperature(self, temperature: float):
        self._temperature = temperature
        self.notify_observers()

class TemperatureDisplay(Observer):
    def update(self, temperature: float):
        print(f"Temperature Display: Current temperature is {temperature}°C")

class TemperatureAlarm(Observer):
    def update(self, temperature: float):
        if temperature > 30.0:
            print("Temperature Alarm: Temperature is above 30°C! Alarm triggered!")
        else:
            print("Temperature Alarm: Temperature is normal.")


import time
import random

if __name__ == "__main__":
    # Cria o sensor de temperatura
    sensor = TemperatureSensor()

    # Cria os observadores
    display = TemperatureDisplay()
    alarm = TemperatureAlarm()

    # Registra os observadores no sensor
    sensor.register_observer(display)
    sensor.register_observer(alarm)

    # Simula mudanças de temperatura
    try:
        while True:
            new_temperature = random.uniform(20.0, 40.0)
            print(f"\nSetting new temperature: {new_temperature:.2f}°C")
            sensor.set_temperature(new_temperature)
            time.sleep(5)  # Aguarda 5 segundos antes de gerar a próxima temperatura
    except KeyboardInterrupt:
        print("Temperature monitoring stopped.")